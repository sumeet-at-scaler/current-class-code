package FairWork.Lecture7_Inter_OOPs;

public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.playASong();

        MusicSystem ms = new BoseMusicSystem();
        car.setMusicSystem(ms);

        car.playASong();
        car.pauseTheSong();

        ms = new SonyMusicSystem();
        car.setMusicSystem(ms);

        car.playASong();
        car.pauseTheSong();
    }
}
