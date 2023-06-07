package FairWork.Lect_Inter_Observor;

public class SMSService implements CreateOrderObservor {
    public SMSService(){
        MainService.inst.register(this);
    }

    @Override
    public void newOrderCreated(OrderDetails od) {
        System.out.println("logic to send sms");
    }
}
