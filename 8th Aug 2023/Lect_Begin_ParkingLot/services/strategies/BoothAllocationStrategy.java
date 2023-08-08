package FairWork.Lect_Begin_ParkingLot.services.strategies;

import FairWork.Lect_Begin_ParkingLot.models.Booth;
import FairWork.Lect_Begin_ParkingLot.models.Gate;
import FairWork.Lect_Begin_ParkingLot.models.enums.VehicleType;

import java.util.Optional;

public interface BoothAllocationStrategy {
    Optional<Booth> assignBooth(VehicleType vehicleType, Gate gate);
}
