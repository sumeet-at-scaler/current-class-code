package FairWork.Lect_Begin_ParkingLot.services;

import FairWork.Lect_Begin_ParkingLot.exceptions.GateNotFoundException;
import FairWork.Lect_Begin_ParkingLot.models.Gate;
import FairWork.Lect_Begin_ParkingLot.models.Ticket;
import FairWork.Lect_Begin_ParkingLot.models.Vehicle;
import FairWork.Lect_Begin_ParkingLot.models.enums.VehicleType;
import FairWork.Lect_Begin_ParkingLot.repositories.TicketRepository;

import java.util.Date;

public class TicketService {
    private TicketRepository ticketRepository;
    private GateService gateService;
    private VehicleService vehicleService;

    public TicketService(TicketRepository ticketRepository,
                         GateService gateService,
                         VehicleService vehicleService){
        this.ticketRepository = ticketRepository;
        this.gateService = gateService;
        this.vehicleService = vehicleService;
    }

    public Ticket generateTicket(Long gateId, String vehicleNumber, VehicleType vehicleType) throws GateNotFoundException {
        // get the gate object => gateService
        Gate gate = gateService.getGateById(gateId);
        // get or register the vehicle => vehicleService
        Vehicle vehicle = vehicleService.getVehicle(vehicleNumber, vehicleType);

        // assign booth using appropriate strategy


        // create ticket object
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        ticket.setEntryGate(gate);
        ticket.setOperator(gate.getCurrentOperator());
        ticket.setVehicle(vehicle);
        ticket.setAssignedBooth(null);

        // save ticket object in db
        Ticket savedTicket = ticketRepository.save(ticket);
        return savedTicket;
    }
}
