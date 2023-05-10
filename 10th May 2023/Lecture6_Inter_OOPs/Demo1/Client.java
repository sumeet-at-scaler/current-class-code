package FairWork.Lecture6_Inter_OOPs.Demo1;

public class Client {
    public static void main(String[] args) {
        final int x;
        final int y;

        x = 10;
        y = 20;

//        y = 30;

        System.out.println(x);

        final Person p1;

        p1 = new Person(10, "ABC");
        p1.age = 20;

//        p1 = new Person(20, "DEF");
    }
}
