package FairWork.Lect_Inter_ParkingLot.models;

import FairWork.ParkingLot.models.enums.ParkingSlotStatus;
import FairWork.ParkingLot.models.enums.VehicleType;

import java.util.List;

public class ParkingSlot extends BaseModel {
    private String number;
    private ParkingSlotStatus parkingSlotStatus;
    private VehicleType supportedVehicleType;
}
