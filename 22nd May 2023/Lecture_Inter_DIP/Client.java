package FairWork.Lecture_Inter_DIP;

public class Client {
    public static void main(String[] args) {
        Sparrow sp = new Sparrow(new SlowFlyator()); // constructor injection
//        sp.ftor = new SlowFlyator(); // Field injection
        sp.fly();

        sp.setFlyator(new SlowFlyator()); // method injection
        sp.fly();

        sp.setFlyator(new FastFlyator());
        sp.fly();


    }
}
