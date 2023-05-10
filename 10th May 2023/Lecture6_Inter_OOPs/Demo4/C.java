package FairWork.Lecture6_Inter_OOPs.Demo4;

public class C extends B {
    int d3;

//    C(){
//        System.out.println("I am in C");
//    }

    C(int data1, int data2, int data3){
        super(data1, data2); // for parameterized ctor first statement of ctor has to be super call
        this.d3 = data3;
    }
}
