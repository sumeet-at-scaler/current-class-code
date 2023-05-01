package FairWork.Lecture3_Inter_OOPs.Demo3;


public class Client {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.display();

        Person p2 = new Person(10);
        p2.display();

        Person p3 = new Person("ABC");
        p3.display();

        Person p4 = new Person(10, "ABC");
        p4.display();

    }
}
