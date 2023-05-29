package FairWork.Lect_Inter_PrototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    public static final StudentRegistry instance = new StudentRegistry();
    private StudentRegistry(){
    }

    private Map<String, Student> dataStore = new HashMap<>();

    public void registerAPrototype(String key, Student proto){
        dataStore.put(key, proto);
    }

    public Student getAPrototype(String key){
        return dataStore.get(key);
    }
}
