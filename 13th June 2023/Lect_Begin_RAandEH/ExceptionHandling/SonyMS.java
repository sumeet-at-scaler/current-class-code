package FairWork.Lect_Begin_RAandEH.ExceptionHandling;

public class SonyMS implements MusicSystem{
    @Override
    public void play() {
        System.out.println("sony logic of playing");
    }

    @Override
    public void pause() {
        System.out.println("sony logic of pausing");
    }
}
