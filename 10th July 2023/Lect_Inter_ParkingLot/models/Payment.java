package FairWork.Lect_Inter_ParkingLot.models;

import FairWork.Lect_Inter_ParkingLot.models.enums.PaymentMode;
import FairWork.Lect_Inter_ParkingLot.models.enums.PaymentStatus;

import java.util.Date;

public class Payment  extends BaseModel{
    private PaymentStatus paymentStatus;
    private PaymentMode paymentMode;
    private Date timeOfPayment;
    private String transactionId;
}
