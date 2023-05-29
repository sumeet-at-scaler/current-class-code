package FairWork.Lect_Inter_PrototypeAndRegistry;

import java.util.ArrayList;
import java.util.HashMap;

public class Client {
    static void populateRegistry(){
        StudentRegistry reg = StudentRegistry.instance;

        Student proto = new Student();
        proto.setName("ABC");
        proto.setAge(10);
        reg.registerAPrototype("Normal Student", proto);

        MeritStudent msProto = new MeritStudent();
        msProto.setAge(12);
        msProto.setName("DEF");
        msProto.setScholarship(100);
        reg.registerAPrototype("Merit Student", msProto);
    }

    public static void main(String[] args) {
        // --- registry will be populated before any other code
        populateRegistry();
        // --- registry will be populated before any other code

//        Student s1 = new Student();
//        s1.setAge(10);
//        s1.setName("ABC");
        Student s1 = StudentRegistry.instance.getAPrototype("Normal Student");

        Student copy = getStudent(s1);
        System.out.println(copy.getAge());
        System.out.println(copy.getName());

        MeritStudent s2 = new MeritStudent();
        s2.setAge(12);
        s2.setName("DEF");
        s2.setScholarship(100);

        Student copy2 = getStudent(s2);
        System.out.println(copy2.getAge());
        System.out.println(copy2.getName());

    }

    static Student getStudent(Student orig){
        return orig.clone();
    }
}
