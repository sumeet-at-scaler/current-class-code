package FairWork.Lecture6_Inter_OOPs.Demo5.Pkg1;

public class Client {
    public static void main(String[] args) {
        A obj = new A();
//        obj.d1 = 10;
        obj.d2 = 20;
        obj.d3 = 30; // even protected is visible to normal class in the same pkg
        obj.d4 = 40;
    }
}
