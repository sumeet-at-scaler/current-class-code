package FairWork.Lect_Inter_ParkingLot.models;

public class Operator extends BaseModel {
    private String name;
    // can have empid and shift timings

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
