package FairWork.Lect_Inter_Factory.FM;

public class Client { // this could be a service like userservice
    public static void main(String[] args) {
        Database db = new MongoDB(); // don't worry about ocp violation here - will be solved by dic
        db.doWork();
    }
}
