package FairWork.Lect_Begin_RAandEH.Reflection;

public class LoadAClassDemo {
    public static void main(String[] args) {
//        try {
//            Class pDetails = Class.forName("FairWork.Lect_Begin_RAandEH.Reflection.Person");
//            System.out.println(pDetails.getSimpleName());
//            Class pDetails = Person.class;
//            System.out.println(pDetails.getSimpleName());

        Person p = new Person(10, "A");
        Class pdetails = p.getClass();
        System.out.println(pdetails.getSimpleName());

//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
    }
}
