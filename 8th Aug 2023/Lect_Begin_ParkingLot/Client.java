package FairWork.Lect_Begin_ParkingLot;

import FairWork.Lect_Begin_ParkingLot.controllers.TicketController;
import FairWork.Lect_Begin_ParkingLot.dtos.GenerateTicketRequestDTO;
import FairWork.Lect_Begin_ParkingLot.dtos.GenerateTicketResponseDTO;
import FairWork.Lect_Begin_ParkingLot.dtos.ResponseStatus;
import FairWork.Lect_Begin_ParkingLot.models.enums.VehicleType;
import FairWork.Lect_Begin_ParkingLot.repositories.*;
import FairWork.Lect_Begin_ParkingLot.services.GateService;
import FairWork.Lect_Begin_ParkingLot.services.TicketService;
import FairWork.Lect_Begin_ParkingLot.services.VehicleService;
import FairWork.Lect_Begin_ParkingLot.services.strategies.BoothAllocationStrategy;
import FairWork.Lect_Begin_ParkingLot.services.strategies.NearestEmptyBoothStrategy;


public class Client {
    public static void main(String[] args) {
        TicketRepository tr = new TicketRepository();

        GateRepository gr = new GateRepository();
        GateService gs = new GateService(gr);

        VehicleRepository vr = new VehicleRepository();
        VehicleService vs = new VehicleService(vr);

        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        BoothRepository boothRepository = new BoothRepository();
        BoothAllocationStrategy boothAllocationStrategy = new NearestEmptyBoothStrategy(parkingLotRepository, boothRepository);

        TicketService ts = new TicketService(tr, gs, vs, boothAllocationStrategy);
        TicketController ticketController = new TicketController(ts);

        GenerateTicketRequestDTO ticketRequestDTO = new GenerateTicketRequestDTO();
        ticketRequestDTO.setVehicleType(VehicleType.MEDIUM);
        ticketRequestDTO.setVehicleNumber("HR 19J 1289");
        ticketRequestDTO.setGateId(10L);

        GenerateTicketResponseDTO ticketResponseDTO = ticketController.generateTicket(ticketRequestDTO);

        if(ticketResponseDTO.getStatus().equals(ResponseStatus.FAILURE)){
            System.out.println(ticketResponseDTO.getMessage());
        } else {
            System.out.println("Ticket generated with id " + ticketResponseDTO.getGeneratedTicketId());
        }

    }
}

