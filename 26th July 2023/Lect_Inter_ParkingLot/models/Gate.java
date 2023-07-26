package FairWork.Lect_Inter_ParkingLot.models;

import FairWork.Lect_Inter_ParkingLot.models.enums.GateType;

public class Gate extends BaseModel {
    private String number;
    private GateType gateType;
    private Operator operator;

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

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
