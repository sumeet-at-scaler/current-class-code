package FairWork.Lect_Inter_Observor;

public class EmailService implements CreateOrderObservor {
    public EmailService(){
        // register to the main service
        MainService.inst.register(this);
    }

    @Override
    public void newOrderCreated(OrderDetails od) {
        System.out.println("logic to send emails");
    }
}
