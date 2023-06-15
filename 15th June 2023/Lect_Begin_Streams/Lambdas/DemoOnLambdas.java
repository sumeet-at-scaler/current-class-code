package FairWork.Lect_Begin_Streams.Lambdas;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class DemoOnLambdas {
    public static void main(String[] args) {
        BiPredicate<Integer, String> way1 = new DemoClassForBiP();

        BiPredicate<Integer, String> way2 = new BiPredicate<Integer, String>() {
            @Override
            public boolean test(Integer integer, String s) {
                return false;
            }
        };

        BiPredicate<Integer, String> way3 = (minLength, str) -> {
            return str.length() > minLength;
        };

        System.out.println(way3.test(5, "bye"));

        BinaryOperator<String> o1 = (s1, s2) -> {
            return s1 + s2;
        };
        System.out.println(o1.apply("hello", "world"));

        BinaryOperator<String> o2 = (s1, s2) -> s1 + s2;
        System.out.println(o2.apply("hi", "bangalore"));

        BiConsumer<Integer, String> o3 = (num, str) -> {
            System.out.println(num);
            System.out.println(str);
        };

        o3.accept(10, "hello");
    }
}
