package com.example.bms_fair_begin.services;

import com.example.bms_fair_begin.exceptions.SeatNotAvailableException;
import com.example.bms_fair_begin.exceptions.UserNotFoundException;
import com.example.bms_fair_begin.models.SeatInShow;
import com.example.bms_fair_begin.models.Ticket;
import com.example.bms_fair_begin.models.User;
import com.example.bms_fair_begin.models.enums.SeatStatus;
import com.example.bms_fair_begin.repositories.SeatInShowRepository;
import com.example.bms_fair_begin.repositories.TicketRepository;
import com.example.bms_fair_begin.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TicketService {
    private TicketRepository ticketRepository;
    private UserRepository userRepository;
    private SeatInShowRepository seatInShowRepository;

    @Autowired
    public TicketService(TicketRepository ticketRepository, UserRepository userRepository, SeatInShowRepository seatInShowRepository){
        this.ticketRepository = ticketRepository;
        this.userRepository = userRepository;
        this.seatInShowRepository = seatInShowRepository;
    }

    public Ticket bookTicket(List<Long> seatInAShowIds, Long userId) throws SeatNotAvailableException, UserNotFoundException{
        // 1. Fetch seatInShows
        // 2. Check if seats are available
        // 3. Fetch user
        // 4.1 Yes => Lock seats, make dummy ticket and return
        // 4.2 No => Throw and exception

        List<SeatInShow> seats = seatInShowRepository.findAllById(seatInAShowIds);
        for(SeatInShow seat: seats){
            if(IsAvailable(seat) == false){
                throw new SeatNotAvailableException();
            }
        }

        Optional<User> userOptional = userRepository.findById(userId);
        if(userOptional.isEmpty()){
            throw new UserNotFoundException();
        }
        User bookedBy = userOptional.get();

        List<SeatInShow> updatedSeats = new ArrayList<>();
        Date current = new Date();
        for(SeatInShow seat: seats){
            seat.setSeatStatus(SeatStatus.Locked);
            seat.setLockedAt(current);
            seat = seatInShowRepository.save(seat);
            updatedSeats.add(seat);
        }

        Ticket ticket = new Ticket();
        ticket.setBookedBy(bookedBy);
        ticket.setBookingTime(current);
        ticket.setSelectedSeats(updatedSeats);
        ticket.setAmount(0); // hit SeatTypeInShow repository for calculating amount
        Ticket savedTicket = ticketRepository.save(ticket);

        return savedTicket;
    }

    private boolean IsAvailable(SeatInShow seat){
        if(seat.getSeatStatus().equals(SeatStatus.Available)){
            return true;
        } else if(seat.getSeatStatus().equals(SeatStatus.Locked)){
            // logic
            // 9:10 pm on 23rd Aug 2023
            long lockedAt = seat.getLockedAt().getTime();
            long current = System.currentTimeMillis();

            long duration = current - lockedAt;
            long durationInSeconds = duration / 1000;
            long durationInMinutes = durationInSeconds/60;

            if(durationInMinutes >= 10){
                return true;
            } else {
                return false;
            }
        }

        return false;
    }
}
