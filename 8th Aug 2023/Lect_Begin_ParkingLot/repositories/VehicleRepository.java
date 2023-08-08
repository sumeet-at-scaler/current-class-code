package FairWork.Lect_Begin_ParkingLot.repositories;

import FairWork.Lect_Begin_ParkingLot.models.Ticket;
import FairWork.Lect_Begin_ParkingLot.models.Vehicle;

import java.util.HashMap;
import java.util.Optional;

public class VehicleRepository {
    private HashMap<Long, Vehicle> vehicleTableMock = new HashMap<>();
    private Long autoIncrementIdMock = 0L;

    public Vehicle save(Vehicle vehicle){
        if(vehicle.getId() == null){
            autoIncrementIdMock++;
            vehicle.setId(autoIncrementIdMock);
            vehicleTableMock.put(autoIncrementIdMock, vehicle);
        } else {
            vehicleTableMock.put(vehicle.getId(), vehicle);
        }

        return vehicle;
    }

    public Optional<Vehicle> fetchVehicleByNumber(String vehicleNumber){
        for(Vehicle vehicle: vehicleTableMock.values()){
            if(vehicle.getVehicleNumber().equals(vehicleNumber)){
                return Optional.of(vehicle);
            }
        }

        return Optional.empty();
    }

    public Optional<Vehicle> fetchVehicleById(Long vehicleId){
        if(vehicleTableMock.containsKey(vehicleId)){
            return Optional.of(vehicleTableMock.get(vehicleId));
        } else {
            return Optional.empty();
        }
    }
}
