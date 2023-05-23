package FairWork.Lecture_Begin_SOLID2;

public class Sparrow {
    private Flyator ref; // just a socket

    // constructor injection
    public Sparrow(Flyator r){
        ref = r;
    }

    // method injection
    public void setFlyator(Flyator r){
        ref = r;
    }

    void fly(){
        if(ref == null){
            System.out.println("No algorithm for flight provided");
            return;
        }
        ref.flightAlgo();
    }
}
