package FairWork.Lect_Inter_Singleton;

public class TargetForAThread implements Runnable {
    @Override
    public void run() {
        DBConn db2 = DBConn.getInstance();
        System.out.println("hello");
    }
}
