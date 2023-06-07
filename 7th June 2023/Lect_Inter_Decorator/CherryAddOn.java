package FairWork.Lect_Inter_Decorator;

public class CherryAddOn implements Icecream {
    private Icecream ic;
    public CherryAddOn(Icecream ic){
        this.ic = ic;
    }

    @Override
    public int getCost() {
        int cost = 5;

        cost += ic.getCost();

        return cost;
    }

    @Override
    public String getDesc() {
        String desc = " with 1 teaspoon of cherries";

        desc = ic.getDesc() + desc;

        return desc;
    }
}
