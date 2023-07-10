package FairWork.Lect_Inter_ParkingLot.models;

import java.util.Date;

public class Ticket  extends BaseModel{
    private Date entryTime;
    private ParkingSlot assignedParkingSlot;
    private Vehicle vehicle;
    private Gate entryGate;
    private Operator operator;
}
