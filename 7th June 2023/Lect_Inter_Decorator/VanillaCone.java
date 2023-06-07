package FairWork.Lect_Inter_Decorator;

public class VanillaCone implements Icecream {
    @Override
    public int getCost() {
        return 9;
    }

    @Override
    public String getDesc() {
        return "A vanilla cone";
    }
}
