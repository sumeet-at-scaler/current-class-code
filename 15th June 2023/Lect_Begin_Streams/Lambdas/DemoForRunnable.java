package FairWork.Lect_Begin_Streams.Lambdas;

public class DemoForRunnable {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName());
        };
        Thread t = new Thread(r);
        t.start();

        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        t1.start();
    }
}
