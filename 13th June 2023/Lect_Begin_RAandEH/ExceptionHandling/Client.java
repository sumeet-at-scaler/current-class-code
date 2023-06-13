package FairWork.Lect_Begin_RAandEH.ExceptionHandling;

public class Client {
    public static void main(String[] args) {
        Car car = new Car();

        try {
            car.setMs(new BoseMS());
            car.playMusic();
        } catch (MusicSystemNotPluggedException e) {
            System.out.println(e);
        }
    }
}
