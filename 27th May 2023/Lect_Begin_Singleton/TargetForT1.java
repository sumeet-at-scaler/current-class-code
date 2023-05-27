package FairWork.Lect_Begin_Singleton;

public class TargetForT1 implements Runnable {
    public DBConn ref;
    @Override
    public void run() {
        DBConn db2 = DBConn.getInstance();
        this.ref = db2;
        System.out.println(db2);
    }
}
