package FairWork.Lect_Inter_ParkingLot;

import FairWork.Lect_Inter_ParkingLot.controllers.TicketController;
import FairWork.Lect_Inter_ParkingLot.dtos.GenerateTicketRequestDTO;
import FairWork.Lect_Inter_ParkingLot.dtos.GenerateTicketResponseDTO;
import FairWork.Lect_Inter_ParkingLot.dtos.ResponseStatus;
import FairWork.Lect_Inter_ParkingLot.models.ParkingLot;
import FairWork.Lect_Inter_ParkingLot.models.enums.VehicleType;
import FairWork.Lect_Inter_ParkingLot.repositiories.ParkingLotRepository;
import FairWork.Lect_Inter_ParkingLot.repositiories.ParkingSlotRepository;
import FairWork.Lect_Inter_ParkingLot.repositiories.TicketRepository;
import FairWork.Lect_Inter_ParkingLot.services.GateService;
import FairWork.Lect_Inter_ParkingLot.services.TicketService;
import FairWork.Lect_Inter_ParkingLot.services.VehicleService;
import FairWork.Lect_Inter_ParkingLot.services.strategies.FirstParkingSlotStrategy;
import FairWork.Lect_Inter_ParkingLot.services.strategies.ParkingSlotAllocationStrategy;

public class Client {
    public static void main(String[] args) {
        GateService gs = new GateService();
        VehicleService vs = new VehicleService();

        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingSlotRepository parkingSlotRepository = new ParkingSlotRepository();
        ParkingSlotAllocationStrategy pas = new FirstParkingSlotStrategy(parkingLotRepository, parkingSlotRepository);
        TicketRepository tr = new TicketRepository();

        TicketService ts = new TicketService(gs, vs, pas, tr);
        TicketController tc = new TicketController(ts);

        GenerateTicketRequestDTO requestDTO = new GenerateTicketRequestDTO();
        requestDTO.setGateId(10L);
        requestDTO.setVehicleNumber("HR 1234");
        requestDTO.setVehicleType(VehicleType.SMALL);

        GenerateTicketResponseDTO responseDTO = tc.generateTicket(requestDTO);
        if(responseDTO.getStatus() == ResponseStatus.SUCCESS){
            System.out.println(responseDTO.getGeneratedTicketId());
        } else {
            System.out.println("FAILURE => " + responseDTO.getMessage());
        }
    }
}

// Make all models first

// Requirement
// 1. Generate a ticket at entry of a vehicle at a gate

// TicketController
// Inputs and Outputs of a controller
// Inputs of a controller
// 1. Can models be this input?

// 2. Can we have multiple parameters in input?
// 2.1 Single parameter is advisable, because the code won't break if accept more values, via more properties in request object

