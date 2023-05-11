package FairWork.Lect12_Threads.Demo3;

public class Adder implements  Runnable {
    Counter c1;

    Adder(Counter c){
        c1 = c;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10000; i++){
            c1.incVal(i);
        }
    }
}
