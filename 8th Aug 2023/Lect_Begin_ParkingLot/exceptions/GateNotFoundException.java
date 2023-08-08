package FairWork.Lect_Begin_ParkingLot.exceptions;

public class GateNotFoundException extends Exception {
    public GateNotFoundException(){
        super("gate with given id not found");
    }
}
