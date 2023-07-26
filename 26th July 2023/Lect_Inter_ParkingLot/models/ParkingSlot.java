package FairWork.Lect_Inter_ParkingLot.models;

import FairWork.ParkingLot.models.enums.ParkingSlotStatus;
import FairWork.ParkingLot.models.enums.VehicleType;

import java.util.List;

public class ParkingSlot extends BaseModel {
    private String number;
    private ParkingSlotStatus parkingSlotStatus;
    private VehicleType supportedVehicleType;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public VehicleType getSupportedVehicleType() {
        return supportedVehicleType;
    }

    public void setSupportedVehicleType(VehicleType supportedVehicleType) {
        this.supportedVehicleType = supportedVehicleType;
    }
}
