package com.example.scaler.bms_fair_inter.controllers;

import com.example.scaler.bms_fair_inter.dtos.BookTicketRequestDTO;
import com.example.scaler.bms_fair_inter.dtos.BookTicketResponseDTO;
import com.example.scaler.bms_fair_inter.dtos.ResponseStatus;
import com.example.scaler.bms_fair_inter.models.Ticket;
import com.example.scaler.bms_fair_inter.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TicketController {
    private TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    // workflow from available to locked
    public BookTicketResponseDTO bookTicket(BookTicketRequestDTO requestDTO){
        BookTicketResponseDTO responseDTO = new BookTicketResponseDTO();

        try{
            Ticket ticket = ticketService.bookTicket(requestDTO.getShowSeatIds(), requestDTO.getUserId());

            responseDTO.setTicketId(ticket.getId());
            responseDTO.setStatus(ResponseStatus.SUCCESS);
            responseDTO.setMessage("Ticket generated successfully");
        } catch(Exception ex){
            responseDTO.setStatus(ResponseStatus.FAILURE);
            responseDTO.setMessage("Something went wrong. Check this message to find out - " + ex.getMessage());
        }

        return responseDTO;
    }
}
