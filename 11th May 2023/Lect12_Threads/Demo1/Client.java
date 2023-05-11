package FairWork.Lect12_Threads.Demo1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        c.val = 10;

        Lock lock = new ReentrantLock();

        Adder a = new Adder(c, lock);
        Subtractor s = new Subtractor(c, lock);

        Thread t1 = new Thread(a);
        t1.start();

        Thread t2 = new Thread(s);
        t2.start();

        // this makes sure that the threads have finished their work
        t1.join();
        t2.join();

        System.out.println(c.val);
    }
}
