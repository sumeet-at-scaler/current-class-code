package FairWork.Lect_Begin_ParkingLot.exceptions;

public class BoothNotAvailableException extends Exception {
    public BoothNotAvailableException(){
        super("no parking booth available");
    }
}
