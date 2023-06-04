package FairWork.Lect_Inter_Semaphores;

import java.util.LinkedList;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private String name;
    private  LinkedList<Object> store;
    private int cap;
    private Semaphore ps;
    private Semaphore cs;

    Producer(String name, LinkedList<Object> store, int cap, Semaphore ps, Semaphore cs){
        this.name = name;
        this.store = store;
        this.cap = cap;
        this.ps = ps;
        this.cs = cs;
    }

    @Override
    public void run() {
        try {
            ps.acquire(); // reducing a producer
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(store.size() < cap) {
            store.add(new Object());
        }
        System.out.println("Size of store = " + store.size());
        cs.release(); // increasing a consumer
    }
}
