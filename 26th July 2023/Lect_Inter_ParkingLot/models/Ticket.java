package FairWork.Lect_Inter_ParkingLot.models;

import java.util.Date;

public class Ticket  extends BaseModel{
    private Date entryTime;
    private ParkingSlot assignedParkingSlot;
    private Vehicle vehicle;
    private Gate entryGate;
    private Operator operator;

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public ParkingSlot getAssignedParkingSlot() {
        return assignedParkingSlot;
    }

    public void setAssignedParkingSlot(ParkingSlot assignedParkingSlot) {
        this.assignedParkingSlot = assignedParkingSlot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
