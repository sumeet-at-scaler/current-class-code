package FairWork.Lect_Inter_ParkingLot.models;

import FairWork.ParkingLot.models.enums.VehicleType;

public class Vehicle  extends BaseModel{
    private String number;
    private VehicleType vehicleType;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
