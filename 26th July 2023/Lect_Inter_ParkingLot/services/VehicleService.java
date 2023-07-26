package FairWork.Lect_Inter_ParkingLot.services;

import FairWork.Lect_Inter_ParkingLot.models.Gate;
import FairWork.Lect_Inter_ParkingLot.models.Vehicle;
import FairWork.Lect_Inter_ParkingLot.models.enums.VehicleType;

public class VehicleService {

    public Vehicle getVehicleByNumber(String vehicleNumber){
        // make a hit to VehicleRepo to get the vehicle registered against this number
        return null;
    }

    public Vehicle registerVehicle(String vehicleNumber, VehicleType vehicleType){
        // call vehicle repo to register the vehicle with these details and set the vehicle id
        return null;
    }
}
