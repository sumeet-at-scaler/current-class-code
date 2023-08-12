package FairWork.Lect_Begin_ParkingLot.services;

import FairWork.Lect_Begin_ParkingLot.exceptions.BoothNotAvailableException;
import FairWork.Lect_Begin_ParkingLot.exceptions.GateNotFoundException;
import FairWork.Lect_Begin_ParkingLot.models.Booth;
import FairWork.Lect_Begin_ParkingLot.models.Gate;
import FairWork.Lect_Begin_ParkingLot.models.Ticket;
import FairWork.Lect_Begin_ParkingLot.models.Vehicle;
import FairWork.Lect_Begin_ParkingLot.models.enums.VehicleType;
import FairWork.Lect_Begin_ParkingLot.repositories.TicketRepository;
import FairWork.Lect_Begin_ParkingLot.services.strategies.BoothAllocationStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private TicketRepository ticketRepository;
    private GateService gateService;
    private VehicleService vehicleService;
    private BoothAllocationStrategy boothAllocationStrategy;

    public TicketService(TicketRepository ticketRepository,
                         GateService gateService,
                         VehicleService vehicleService,
                         BoothAllocationStrategy boothAllocationStrategy){
        this.ticketRepository = ticketRepository;
        this.gateService = gateService;
        this.vehicleService = vehicleService;
        this.boothAllocationStrategy = boothAllocationStrategy;
    }

    public Ticket generateTicket(Long gateId, String vehicleNumber, VehicleType vehicleType) throws GateNotFoundException, BoothNotAvailableException {
        // get the gate object => gateService
        Gate gate = gateService.getGateById(gateId);
        // get or register the vehicle => vehicleService
        Vehicle vehicle = vehicleService.getVehicle(vehicleNumber, vehicleType);

        // assign booth using appropriate strategy
        Optional<Booth> assignedBoothWrapper = boothAllocationStrategy.assignBooth(vehicleType, gate);
        if(assignedBoothWrapper.isEmpty()){
            throw new BoothNotAvailableException();
        }

        // create ticket object
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        ticket.setEntryGate(gate);
        ticket.setOperator(gate.getCurrentOperator());
        ticket.setVehicle(vehicle);
        ticket.setAssignedBooth(assignedBoothWrapper.get());

        // save ticket object in db
        Ticket savedTicket = ticketRepository.save(ticket);
        return savedTicket;
    }
}
