package FairWork.Lecture7_Inter_OOPs;

public class BoseMusicSystem implements MusicSystem {

    @Override
    public void play() {
        System.out.println("Bose logic of playing a song");
    }

    @Override
    public void pause() {
        System.out.println("Bose logic of pausing a song");
    }

    @Override
    public void forward(int duration) {
        System.out.println("Bose logic of forwarding a song");
    }

    @Override
    public void rewind(int duration) {
        System.out.println("Bose logic of rewinding a song");
    }

    @Override
    public void setVolume(int level) {
        System.out.println("Bose logic of setting the volume");
    }
}
