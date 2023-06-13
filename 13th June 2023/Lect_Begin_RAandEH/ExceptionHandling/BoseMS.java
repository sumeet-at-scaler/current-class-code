package FairWork.Lect_Begin_RAandEH.ExceptionHandling;

public class BoseMS implements MusicSystem{
    @Override
    public void play() {
        System.out.println("bose logic of playing");
    }

    @Override
    public void pause() {
        System.out.println("bose logic of pausing");
    }
}
