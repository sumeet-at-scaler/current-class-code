package FairWork.Lecture3_Inter_OOPs.Demo4;

public class Client {
    public static void main(String[] args) {
        Point p1 = new Point(10, 10);
        Point p2 = new Point(20, 5);

        Rectangle r1 = new Rectangle(p1, p2);

//        p1.display();
//        p2.display();
//        r1.display();
//
//        p1.x = 100;
//        p1.display();
//        r1.display();


        Rectangle r2 = new Rectangle(r1);

        r1.display();
        r2.display();

        r1.tl.x = 100;
        r1.display();
        r2.display();
    }
}
