package FairWork.Lect_Begin_ParkingLot.models;

import java.util.Date;

public class Ticket extends BaseModel  {
    private Date entryTime;
    private Vehicle vehicle;
    private Gate entryGate;
    private Operator operator;
    private Booth assignedBooth;

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
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

    public Booth getAssignedBooth() {
        return assignedBooth;
    }

    public void setAssignedBooth(Booth assignedBooth) {
        this.assignedBooth = assignedBooth;
    }
}
