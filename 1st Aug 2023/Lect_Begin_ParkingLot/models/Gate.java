package FairWork.Lect_Begin_ParkingLot.models;

import FairWork.Lect_Begin_ParkingLot.models.enums.GateType;

public class Gate extends BaseModel  {
    private String number;
    private GateType gateType;
    private Operator currentOperator;
    private ParkingLot parkingLot;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public Operator getCurrentOperator() {
        return currentOperator;
    }

    public void setCurrentOperator(Operator currentOperator) {
        this.currentOperator = currentOperator;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }
}
