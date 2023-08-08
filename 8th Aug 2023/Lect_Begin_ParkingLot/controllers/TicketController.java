package FairWork.Lect_Begin_ParkingLot.controllers;

import FairWork.Lect_Begin_ParkingLot.dtos.GenerateTicketRequestDTO;
import FairWork.Lect_Begin_ParkingLot.dtos.GenerateTicketResponseDTO;
import FairWork.Lect_Begin_ParkingLot.dtos.ResponseStatus;
import FairWork.Lect_Begin_ParkingLot.models.Ticket;
import FairWork.Lect_Begin_ParkingLot.services.TicketService;

public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDTO generateTicket(GenerateTicketRequestDTO requestDTO){
        GenerateTicketResponseDTO responseDTO = new GenerateTicketResponseDTO();

        try {
            Ticket ticket = ticketService.generateTicket(requestDTO.getGateId(),
                    requestDTO.getVehicleNumber(),
                    requestDTO.getVehicleType());

            responseDTO.setGeneratedTicketId(ticket.getId());
            responseDTO.setStatus(ResponseStatus.SUCCESS);
            responseDTO.setMessage("Ticket generated successfully");
        } catch(Exception ex){
            // ideally don't give exception message, might leak application details
            // log it, give the client id of log
            responseDTO.setStatus(ResponseStatus.FAILURE);
            responseDTO.setMessage(ex.getMessage());
        }

        return responseDTO;
    }

}
