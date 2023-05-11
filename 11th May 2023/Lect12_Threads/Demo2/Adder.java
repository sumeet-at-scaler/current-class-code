package FairWork.Lect12_Threads.Demo2;

import java.util.concurrent.locks.Lock;

public class Adder implements  Runnable {
    Counter c1;

    Adder(Counter c){
        c1 = c;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10000; i++){
            synchronized (c1) {
                c1.val += i;
            }
        }
    }
}
