package FairWork.Lect_Inter_Factory.FM;

import FairWork.Lect_Inter_Factory.Common.Query;

public abstract class Database {
    public void doWork(){
        Query q = getQuery();
        q.execute();
    }

    abstract Query getQuery(); // this is a factory method
}
