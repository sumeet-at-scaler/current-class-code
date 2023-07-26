package FairWork.Lect_Inter_ParkingLot.services;

import FairWork.Lect_Inter_ParkingLot.exceptions.NoSlotAssignedException;
import FairWork.Lect_Inter_ParkingLot.models.Gate;
import FairWork.Lect_Inter_ParkingLot.models.ParkingSlot;
import FairWork.Lect_Inter_ParkingLot.models.Ticket;
import FairWork.Lect_Inter_ParkingLot.models.Vehicle;
import FairWork.Lect_Inter_ParkingLot.models.enums.VehicleType;
import FairWork.Lect_Inter_ParkingLot.repositiories.TicketRepository;
import FairWork.Lect_Inter_ParkingLot.services.strategies.ParkingSlotAllocationStrategy;


import java.util.Date;

public class TicketService {
    private GateService gs; // this is set to null, we have to solve this problem
    private VehicleService vs; // this is set to null, we have to solve this problem

    private ParkingSlotAllocationStrategy pas; // this is set to null, we have to solve this problem

    private TicketRepository tr;

    public TicketService(GateService gs, VehicleService vs, ParkingSlotAllocationStrategy pas, TicketRepository tr){
        this.gs = gs;
        this.vs = vs;
        this.pas = pas;
        this.tr = tr;
    }

    public Ticket generateTicket(Long gateId, String vehicleNumber, VehicleType vehicleType) throws NoSlotAssignedException{
        Gate gate = gs.getGateById(gateId);
        Vehicle vehicle = vs.getVehicleByNumber(vehicleNumber);
        if(vehicle == null){
            vehicle = vs.registerVehicle(vehicleNumber, vehicleType);
        }

        ParkingSlot assignedSlot = pas.assignParkingSlot(gateId, vehicleType);
        if(assignedSlot == null){
            throw new NoSlotAssignedException();
        }

        // HIT the ParkingSlotService to mark this slot as occupied now

        // set 5 properties in ticket and save it to db
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        ticket.setEntryGate(gate);
        ticket.setVehicle(vehicle);
        ticket.setOperator(gate.getOperator());
        ticket.setAssignedParkingSlot(assignedSlot);

        tr.save(ticket);

        return ticket;
    }

}
