package FairWork.Lect_Inter_Decorator;

public class MangoCone implements Icecream {
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDesc() {
        return "A mango cone";
    }
}
