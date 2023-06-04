package FairWork.Lect_Inter_Semaphores;

import java.util.LinkedList;
import java.util.concurrent.Semaphore;

public class Consumer implements  Runnable {
    private String name;
    private LinkedList<Object> store;
    private int cap;
    private Semaphore ps;
    private Semaphore cs;

    Consumer(String name, LinkedList<Object> store, int cap, Semaphore ps, Semaphore cs){
        this.name = name;
        this.store = store;
        this.cap = cap;
        this.ps = ps;
        this.cs = cs;
    }

    @Override
    public void run() {
        try {
            cs.acquire(); // reduce consumer
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(store.size() > 0) {
            store.remove();
        }

        System.out.println("Size of store = " + store.size());
        ps.release(); // increase producer when consumer leaves
    }
}
