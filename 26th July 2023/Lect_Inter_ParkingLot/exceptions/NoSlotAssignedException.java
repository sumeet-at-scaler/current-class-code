package FairWork.Lect_Inter_ParkingLot.exceptions;

public class NoSlotAssignedException extends Exception {
    public NoSlotAssignedException(){
        super("No slot could be assigned");
    }
}
