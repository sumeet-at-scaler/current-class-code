package FairWork.Lect_Inter_ParkingLot.models;

import java.util.List;

public class ParkingLot extends BaseModel {
    private String address;
    private List<ParkingSlot> parkingSlots;
    private List<Gate> gates;
}
