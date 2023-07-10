package FairWork.Lect_Inter_ParkingLot.models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
    private Date exitTime;
    private Gate exitGate;
    private Operator operator;
    private Ticket ticket;
    private int amount;
    private String invoiceNumber;
    private List<Payment> payments;
}
