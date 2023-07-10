package FairWork.Lect_Inter_ParkingLot.models;

import FairWork.Lect_Inter_ParkingLot.models.enums.GateType;

public class Gate extends BaseModel {
    private String number;
    private GateType gateType;
    private Operator operator;
}
