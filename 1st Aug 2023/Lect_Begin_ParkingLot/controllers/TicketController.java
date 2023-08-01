package FairWork.Lect_Begin_ParkingLot.controllers;

import FairWork.Lect_Begin_ParkingLot.dtos.GenerateTicketRequestDTO;
import FairWork.Lect_Begin_ParkingLot.dtos.GenerateTicketResponseDTO;
import FairWork.Lect_Begin_ParkingLot.dtos.ResponseStatus;
import FairWork.Lect_Begin_ParkingLot.services.strategies.TicketService;
import FairWork.ParkingLot.models.Ticket;


public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    GenerateTicketResponseDTO generateTicket(GenerateTicketRequestDTO requestDTO){
        GenerateTicketResponseDTO responseDTO = null;

        try {
            Ticket ticket = ticketService.generateTicket(requestDTO);

            responseDTO.setGeneratedTicketId(ticket.getId());
            responseDTO.setStatus(ResponseStatus.SUCCESS);
            responseDTO.setMessage("Ticket generated successfully");
        } catch(Exception ex){
            responseDTO.setStatus(ResponseStatus.FAILURE);
            responseDTO.setMessage(ex.getMessage());
            // ideally don't give exception message, might leak application details
            // log it, give the client id of log
        }

        return responseDTO;
    }

}
