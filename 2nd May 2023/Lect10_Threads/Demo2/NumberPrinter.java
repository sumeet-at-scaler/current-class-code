package FairWork.Lect10_Threads.Demo2;

public class NumberPrinter implements Runnable {
    private int numToPrint = 1;

    @Override
    public void run() {
        numToPrint++;
        System.out.println(numToPrint + " printed by thread = " + Thread.currentThread().getName());

    }
}
