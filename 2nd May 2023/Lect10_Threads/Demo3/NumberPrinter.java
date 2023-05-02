package FairWork.Lect10_Threads.Demo3;

public class NumberPrinter implements Runnable {
    private int numToPrint;

    public NumberPrinter(int numToPrint){
        this.numToPrint = numToPrint;
    }

    @Override
    public void run() {
        System.out.println(numToPrint + " printed by thread = " + Thread.currentThread().getName());
    }
}
