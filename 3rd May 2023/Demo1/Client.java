package FairWork.Lecture4_Inter_OOPs.Demo1;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.age = 10;
        s1.name = "ABC";

        s2.age = 20;
        s2.name = "DEF";

        Student.schoolName = "DAV";
        s1.schoolName = "Manav Mangal";
        System.out.println(s2.schoolName);
    }
}
