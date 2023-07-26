package com.example.scaler.bms_fair_inter.services;

import com.example.scaler.bms_fair_inter.exceptions.ShowSeatNotAvailableException;
import com.example.scaler.bms_fair_inter.exceptions.UserNotFoundException;
import com.example.scaler.bms_fair_inter.models.SeatInShow;
import com.example.scaler.bms_fair_inter.models.Ticket;
import com.example.scaler.bms_fair_inter.models.User;
import com.example.scaler.bms_fair_inter.models.enums.SeatStatus;
import com.example.scaler.bms_fair_inter.repositiories.ShowSeatRepository;
import com.example.scaler.bms_fair_inter.repositiories.TicketRepository;
import com.example.scaler.bms_fair_inter.repositiories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TicketService {
    private ShowSeatRepository showSeatRepository;
    private UserRepository userRepository;
    private TicketRepository ticketRepository;

    @Autowired
    public TicketService(ShowSeatRepository showSeatRepository, UserRepository userRepository, TicketRepository ticketRepository){
        this.showSeatRepository = showSeatRepository;
        this.userRepository = userRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket bookTicket(List<Long> showSeatIds, Long userId) throws ShowSeatNotAvailableException, UserNotFoundException{
        // 1. Get showSeats for selected Ids
        // 2. Check if they are available => available or locked 10 minutes ago
        // 3. If not available, send back with an exception
        // 4. Else, Lock them now for this user

        // 5. Prepare dummy ticket
        // 6. Return ticket

        List<SeatInShow> selectedSeats = showSeatRepository.findByIds(showSeatIds);
        for(SeatInShow seat: selectedSeats){
            if(IsSeatAvailable(seat) == false){
                throw new ShowSeatNotAvailableException();
            }
        }

        User bookedBy = userRepository.findById(userId);
        if(bookedBy == null){
            throw new UserNotFoundException();
        }

        List<SeatInShow> selectedUpdatedSeats = new ArrayList<>();
        for(SeatInShow seat: selectedSeats){
            seat.setSeatStatus(SeatStatus.LOCKED);
            seat.setStatusUpdatedAt(new Date());
            seat = showSeatRepository.save(seat);
            selectedUpdatedSeats.add(seat);
        }

        Ticket ticket = new Ticket();
        ticket.setBookedBy(bookedBy);
        ticket.setBookingTime(new Date());
        ticket.setSeats(selectedUpdatedSeats);
        ticket = ticketRepository.save(ticket);
        // also set the amount to be paid in ticket by calling seatTypeInShowRepository

        return ticket;
    }

    private boolean IsSeatAvailable(SeatInShow seat){
        if(seat.getSeatStatus() == SeatStatus.AVAILABLE){
            return true;
        } else if(seat.getSeatStatus() == SeatStatus.LOCKED){
            Long lockedAt = seat.getStatusUpdatedAt().getTime();
            Long currentTime = System.currentTimeMillis();
            Long duration = currentTime - lockedAt;
            Long durationInSeconds = duration / 1000;
            Long durationInMinutes = durationInSeconds / 60;

            if(durationInMinutes >= 10){
                return true;
            }
        }

        return false;
    }
}
