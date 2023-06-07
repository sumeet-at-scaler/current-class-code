package FairWork.Lect_Inter_Decorator;

public class Client {
    public static void main(String[] args) {
        Icecream mc = new MangoCone();
        Icecream mcWvs = new VanillaScoopAddOn(mc);
        Icecream mcWvsWch = new CherryAddOn(mcWvs);

        System.out.println(mcWvsWch.getCost());
        System.out.println(mcWvsWch.getDesc());
    }
}
