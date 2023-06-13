package FairWork.Lect_Begin_RAandEH.ExceptionHandling;

public class Car {
    private MusicSystem ms;
    public void setMs(MusicSystem ms){
        this.ms = ms;
    }

    void playMusic() throws MusicSystemNotPluggedException{
        if(ms == null){
            throw new MusicSystemNotPluggedException();
        }
        ms.play();
    }
}
