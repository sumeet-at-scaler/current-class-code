package FairWork.Lect11_Threads.AdderSubtractorProblem;

public class Adder implements  Runnable {
    Counter c1;

    Adder(Counter c){
        c1 = c;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10000; i++){
            c1.val += i;
        }
    }
}
