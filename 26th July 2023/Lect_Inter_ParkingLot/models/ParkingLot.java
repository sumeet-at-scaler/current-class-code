package FairWork.Lect_Inter_ParkingLot.models;

import java.util.List;

public class ParkingLot extends BaseModel {
    private String address;
    private List<ParkingSlot> parkingSlots;
    private List<Gate> gates;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }
}
