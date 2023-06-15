package FairWork.Lect_Begin_Streams.FI;

public class Client {
    public static void main(String[] args) {
        DemoInterface way1 = new DemoImplementation();
        way1.fun();

        DemoInterface way2 = new DemoInterface() {
            @Override
            public void fun() {
                System.out.println("anonymous class way");
            }
        };
        way2.fun();
    }
}
