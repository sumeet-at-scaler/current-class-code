package FairWork.Lect10_Threads.Demo2;

public class Client {

    public static void main(String[] args) {

        System.out.println("Hi from " + Thread.currentThread().getName());

        NumberPrinter np = new NumberPrinter();
        for(int i = 1; i <= 1000; i++){
            Thread t = new Thread(np);
            t.start();
        }
        System.out.println("Bye from " + Thread.currentThread().getName());
    }
}
