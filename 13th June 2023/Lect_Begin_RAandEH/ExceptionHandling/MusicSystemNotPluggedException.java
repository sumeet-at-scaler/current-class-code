package FairWork.Lect_Begin_RAandEH.ExceptionHandling;

public class MusicSystemNotPluggedException extends Exception {
    public MusicSystemNotPluggedException(){
        super("You've not plugged in an appropriate music system. You can't use this functionality without that.");
    }
}
