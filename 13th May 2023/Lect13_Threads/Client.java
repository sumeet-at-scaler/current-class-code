package FairWork.Lect13_Threads;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Queue<Object> store = new LinkedList<>();
        int cap = 5;
        Semaphore ps = new Semaphore(5);
        Semaphore cs = new Semaphore(0);

        for(int i = 1; i <= 1000; i++){
            Producer p = new Producer("p" + i, ps, cs, store);
            Thread tforp = new Thread(p);
            tforp.start();

            Consumer c = new Consumer("c" + i, ps, cs, store);
            Thread tforc = new Thread(c);
            tforc.start();
        }
    }
}
