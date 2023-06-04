package FairWork.Lect_Inter_Semaphores;

import java.util.LinkedList;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        LinkedList<Object> store = new LinkedList<>();
        int cap = 5;
        Semaphore ps = new Semaphore(cap);
        Semaphore cs = new Semaphore(0);

        for(int i = 1; i <= 1000; i++){
            Producer p = new Producer("p" + i, store, cap, ps, cs);
            Thread t_for_producer = new Thread(p);

            Consumer c = new Consumer("c" + i, store, cap, ps, cs);
            Thread t_for_consumer = new Thread(c);

            t_for_producer.start();
            t_for_consumer.start();
        }
    }
}
