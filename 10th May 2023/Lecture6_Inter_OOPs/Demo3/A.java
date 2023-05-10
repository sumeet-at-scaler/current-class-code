package FairWork.Lecture6_Inter_OOPs.Demo3;

public class A {
    int d = 10;
    void fun1(){
        System.out.println("f1 in A");
    }

    final void fun(){
        System.out.println("f in A");
    }

    void fun(int x){
        System.out.println("f with a param in A");
    }
}
