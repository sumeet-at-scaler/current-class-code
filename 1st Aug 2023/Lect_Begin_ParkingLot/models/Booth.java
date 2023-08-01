package FairWork.Lect_Begin_ParkingLot.models;

import FairWork.Lect_Begin_ParkingLot.models.enums.ParkingBoothStatus;
import FairWork.Lect_Begin_ParkingLot.models.enums.VehicleType;

public class Booth extends BaseModel  {
    private String number;
    private VehicleType supportedVehicleType;
    private ParkingBoothStatus boothStatus;
    private ParkingLot parkingLot;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public VehicleType getSupportedVehicleType() {
        return supportedVehicleType;
    }

    public void setSupportedVehicleType(VehicleType supportedVehicleType) {
        this.supportedVehicleType = supportedVehicleType;
    }

    public ParkingBoothStatus getBoothStatus() {
        return boothStatus;
    }

    public void setBoothStatus(ParkingBoothStatus boothStatus) {
        this.boothStatus = boothStatus;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }
}
