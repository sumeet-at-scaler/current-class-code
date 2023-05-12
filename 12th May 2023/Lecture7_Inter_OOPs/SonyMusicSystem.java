package FairWork.Lecture7_Inter_OOPs;

public class SonyMusicSystem implements MusicSystem {

    @Override
    public void play() {
        System.out.println("Sony logic of playing a song");
    }

    @Override
    public void pause() {
        System.out.println("Sony logic of pausing a song");
    }

    @Override
    public void forward(int duration) {
        System.out.println("Sony logic of forwarding a song");
    }

    @Override
    public void rewind(int duration) {
        System.out.println("Sony logic of rewinding a song");
    }

    @Override
    public void setVolume(int level) {
        System.out.println("Sony logic of setting the volume");
    }
}
