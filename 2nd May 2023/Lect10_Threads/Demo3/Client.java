package FairWork.Lect10_Threads.Demo3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {

        System.out.println("Hi from " + Thread.currentThread().getName());
        ExecutorService es = Executors.newFixedThreadPool(10);

        for(int i = 1; i <= 100; i++){
            NumberPrinter np = new NumberPrinter(i);
            es.submit(np);
//            Thread t = new Thread(np);
//            t.start();
        }

        System.out.println("Bye from " + Thread.currentThread().getName());
        es.shutdown();
    }
}
