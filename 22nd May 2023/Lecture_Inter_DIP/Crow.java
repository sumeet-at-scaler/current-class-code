package FairWork.Lecture_Inter_DIP;

public class Crow implements Flyable {
    @Override
    public void fly() {
        if(ftor == null){
            System.out.println("Dependency not plugged");
            return;
        }
        ftor.makeFly();
    }

    private Flyator ftor;
    public void setFlyator(Flyator ftor){
        this.ftor = ftor;
    }
}
