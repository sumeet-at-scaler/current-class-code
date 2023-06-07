package FairWork.Lect_Inter_Decorator;

public class VanillaScoopAddOn implements Icecream {
    private Icecream ic;
    public VanillaScoopAddOn(Icecream ic){
        this.ic = ic;
    }

    @Override
    public int getCost() {
        int cost = 7;

        cost += ic.getCost();

        return cost;
    }

    @Override
    public String getDesc() {
        String desc = " with vanilla scoop";

        desc = ic.getDesc() + desc;

        return desc;
    }
}
