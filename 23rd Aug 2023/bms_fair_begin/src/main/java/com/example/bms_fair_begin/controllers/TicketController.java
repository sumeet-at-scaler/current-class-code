package com.example.bms_fair_begin.controllers;

import com.example.bms_fair_begin.dtos.BookTicketRequestDTO;
import com.example.bms_fair_begin.dtos.BookTicketResponseDTO;
import com.example.bms_fair_begin.dtos.ResponseStatus;
import com.example.bms_fair_begin.models.Ticket;
import com.example.bms_fair_begin.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TicketController {
    // generate a ticket => select the seats
    // 1. retrieve
    // 2. check if available
    // 3.1 no => exception
    // 3.2 yes
    // lock the seats
    // generate a dummy ticket
    // redirect to payment gateway

    private TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    BookTicketResponseDTO bookTicket(BookTicketRequestDTO bookTicketRequestDTO){
        BookTicketResponseDTO bookTicketResponseDTO = new BookTicketResponseDTO();

        try {
            Ticket ticket = ticketService.bookTicket(bookTicketRequestDTO.getSeatInAShowIds(), bookTicketRequestDTO.getUserId());

            bookTicketResponseDTO.setIdOfTheDummyTicket(ticket.getId());
            bookTicketResponseDTO.setStatus(ResponseStatus.SUCCESS);
            bookTicketResponseDTO.setMessage("Dummy ticket generated successfully. Go to payment gateway to finish booking the ticket.");
        } catch(Exception ex){
            bookTicketResponseDTO.setStatus(ResponseStatus.FAILURE);
            bookTicketResponseDTO.setMessage("Something wrong happened. Couldn't book the ticket.");
            // log the error and send log id to the user
        }

        return bookTicketResponseDTO;
    }



    // 1 select seats (bookTicket) => seats are locked, dummy ticket generated
    // 2 sent to payment gateway with dummy ticket id => does payment and gets a (transactionId). redirected to bms
    // 3 confirmTicket (ticketId, transactionId) => seats are booked, put payment details in dummy ticket (real ticket)


}
