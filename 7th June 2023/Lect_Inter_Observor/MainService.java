package FairWork.Lect_Inter_Observor;

import java.util.ArrayList;
import java.util.List;

public class MainService {
    // singleton only for our experiment, not necessary in real code
    public static final MainService inst = new MainService();
    private MainService(){

    }

    private List<CreateOrderObservor> observors = new ArrayList<>();
    public void register(CreateOrderObservor obs){
        observors.add(obs);
    }

    public void unregister(CreateOrderObservor obs){
        observors.remove(obs);
    }

    void createOrder(){
        System.out.println("call the facade and create the order");
        OrderDetails od = new OrderDetails(); // this will be received from facade
        od.orderId = 10;
        od.address = "Ghaziabad";
        od.email = "abc@def.com";
        od.pno = "999";

        for(CreateOrderObservor obs: observors){
            obs.newOrderCreated(od);
        }
    }
}
