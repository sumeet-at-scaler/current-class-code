package FairWork.Lect_Inter_ParkingLot.services.strategies;

import FairWork.Lect_Inter_ParkingLot.models.ParkingSlot;
import FairWork.Lect_Inter_ParkingLot.models.enums.VehicleType;

public interface ParkingSlotAllocationStrategy {
    ParkingSlot assignParkingSlot(Long gateId, VehicleType vehicleType);
}
