package FairWork.Lect_Begin_ParkingLot.services;

import FairWork.Lect_Begin_ParkingLot.models.Ticket;
import FairWork.Lect_Begin_ParkingLot.models.Vehicle;
import FairWork.Lect_Begin_ParkingLot.models.enums.VehicleType;
import FairWork.Lect_Begin_ParkingLot.repositories.TicketRepository;
import FairWork.Lect_Begin_ParkingLot.repositories.VehicleRepository;

import java.util.Optional;

public class VehicleService {
    private VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository){
        this.vehicleRepository = vehicleRepository;
    }


    public Vehicle getVehicle(String vehicleNumber, VehicleType vehicleType){
        Optional<Vehicle> vehicleWrapper = vehicleRepository.fetchVehicleByNumber(vehicleNumber);

        if(vehicleWrapper.isEmpty()){
            // register the new vehicle
            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setVehicleType(vehicleType);

            Vehicle savedVehicle = vehicleRepository.save(vehicle);
            return savedVehicle;
        } else {
            return vehicleWrapper.get();
        }
    }
}
