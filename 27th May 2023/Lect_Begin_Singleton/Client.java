package FairWork.Lect_Begin_Singleton;

public class Client {
    public static void main(String[] args) throws InterruptedException{
        TargetForT1 o1 = new TargetForT1();
        Thread t1 = new Thread(o1);

        TargetForT2 o2 = new TargetForT2();
        Thread t2 = new Thread(o2);

        t1.start();
        t2.start();

        DBConn db1 = DBConn.getInstance();
        System.out.println(db1);

        t1.join();
        t2.join();
    }
}
