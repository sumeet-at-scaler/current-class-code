package FairWork.Lect_Inter_Singleton;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new TargetForAThread());
        Thread t2 = new Thread(new AnotherTargetForAThread());
        t1.start();
        t2.start();

        DBConn db1 = DBConn.getInstance();

        t1.join();
        t2.join();
    }
}
