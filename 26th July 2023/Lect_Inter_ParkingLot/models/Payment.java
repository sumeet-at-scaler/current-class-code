package FairWork.Lect_Inter_ParkingLot.models;

import FairWork.Lect_Inter_ParkingLot.models.enums.PaymentMode;
import FairWork.Lect_Inter_ParkingLot.models.enums.PaymentStatus;

import java.util.Date;

public class Payment  extends BaseModel{
    private PaymentStatus paymentStatus;
    private PaymentMode paymentMode;
    private Date timeOfPayment;
    private String transactionId;

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Date getTimeOfPayment() {
        return timeOfPayment;
    }

    public void setTimeOfPayment(Date timeOfPayment) {
        this.timeOfPayment = timeOfPayment;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
