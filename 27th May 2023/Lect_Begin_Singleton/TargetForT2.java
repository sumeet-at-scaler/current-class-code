package FairWork.Lect_Begin_Singleton;

public class TargetForT2 implements Runnable {
    public DBConn ref;
    @Override
    public void run() {
        DBConn db3 = DBConn.getInstance();
        this.ref = db3;
        System.out.println(db3);
    }
}
