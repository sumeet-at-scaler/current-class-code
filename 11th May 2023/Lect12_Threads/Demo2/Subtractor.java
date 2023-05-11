package FairWork.Lect12_Threads.Demo2;

import java.util.concurrent.locks.Lock;

public class Subtractor implements  Runnable{
    Counter c2;

    Subtractor(Counter c){
        c2 = c;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10000; i++){
            synchronized (c2) {
                c2.val -= i;
            }
        }
    }
}
