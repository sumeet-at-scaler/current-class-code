package FairWork.Lecture_Inter_DIP;

public class Sparrow implements Flyable {
    private Flyator ftor;

    public Sparrow(Flyator ftor){
        if(ftor == null){
            throw new IllegalArgumentException("can't pass a null dependency");
        }
        this.ftor = ftor;
    }

    @Override
    public void fly() {
        if(ftor == null){
            System.out.println("Dependency not plugged");
            return;
        }
        ftor.makeFly();
    }

    public void setFlyator(Flyator ftor){
        this.ftor = ftor;
    }

}
