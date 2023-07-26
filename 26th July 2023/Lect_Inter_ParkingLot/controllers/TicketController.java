package FairWork.Lect_Inter_ParkingLot.controllers;

import FairWork.Lect_Inter_ParkingLot.dtos.GenerateTicketRequestDTO;
import FairWork.Lect_Inter_ParkingLot.dtos.GenerateTicketResponseDTO;
import FairWork.Lect_Inter_ParkingLot.dtos.ResponseStatus;
import FairWork.Lect_Inter_ParkingLot.models.Ticket;
import FairWork.Lect_Inter_ParkingLot.models.enums.VehicleType;
import FairWork.Lect_Inter_ParkingLot.services.TicketService;

// BREAK FROM 10:41 to 10:51
public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }
    public GenerateTicketResponseDTO generateTicket(GenerateTicketRequestDTO requestObject){
        GenerateTicketResponseDTO responseDTO = new GenerateTicketResponseDTO();

        try {
            Ticket ticket = ticketService.generateTicket(requestObject.getGateId(), requestObject.getVehicleNumber(),
                                                    requestObject.getVehicleType());

            responseDTO.setGeneratedTicketId(ticket.getId());
            responseDTO.setStatus(ResponseStatus.SUCCESS);
        } catch(Exception ex){
            // handle wrong
            responseDTO.setStatus(ResponseStatus.FAILURE);
            responseDTO.setMessage(ex.getMessage());
        }

        return responseDTO;
    }
}
