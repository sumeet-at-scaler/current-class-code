package FairWork.Lect_Inter_Factory.FM;

import FairWork.Lect_Inter_Factory.Common.MongoQuery;
import FairWork.Lect_Inter_Factory.Common.MySQLQuery;
import FairWork.Lect_Inter_Factory.Common.Query;

public class MongoDB extends Database {
    public Query getQuery(){
        return new MongoQuery();
    }
}
