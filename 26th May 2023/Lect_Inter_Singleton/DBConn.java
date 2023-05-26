package FairWork.Lect_Inter_Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBConn {
    private DBConn(){

    }
    private static Lock lock = new ReentrantLock();
    private static DBConn inst;
    public static DBConn getInstance(){
        if(inst == null){
            lock.lock();
            if(inst == null){
                inst = new DBConn();
            }
            lock.unlock();
        }

        return inst;
    }
}
