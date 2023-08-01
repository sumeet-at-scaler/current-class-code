package FairWork.Lect_Begin_ParkingLot.models;

import FairWork.Lect_Begin_ParkingLot.models.enums.PaymentMode;
import FairWork.Lect_Begin_ParkingLot.models.enums.PaymentStatus;

public class Payment extends BaseModel  {
    private int amount;
    private Bill bill;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
