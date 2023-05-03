package FairWork.Lecture4_Inter_OOPs.Demo4;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        // Java example of overloading
        Arrays.sort(new int[] {10, 20, 30});
        fun(10, 20);
        fun("hi", "bye");
        fun(10, "bye");
    }

    static void fun(int x, int y){
        System.out.println(x + y);
    }

    static void fun(String x, String y){
        System.out.println(x + y);
    }

    static void fun(int x, String y){
        System.out.println(x + y);
    }

//    int fun(int x, int y){
//        return x + y;
//    }
}
