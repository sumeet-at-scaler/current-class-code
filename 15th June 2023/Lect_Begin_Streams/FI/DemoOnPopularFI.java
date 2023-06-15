package FairWork.Lect_Begin_Streams.FI;

import java.util.function.*;

public class DemoOnPopularFI {
    public static void main(String[] args) {
        Consumer<Integer> obj = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {

            }
        };

        BiConsumer<String, Integer> biConsumer = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {

            }
        };

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        };

        BiPredicate<Integer, String> biPredicate = new BiPredicate<Integer, String>() {
            @Override
            public boolean test(Integer integer, String s) {
                return false;
            }
        };

        Function<Integer, String> function = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return null;
            }
        };


        BiFunction<Integer, String, Double> biFunction = new BiFunction<Integer, String, Double>() {
            @Override
            public Double apply(Integer integer, String s) {
                return null;
            }
        };

        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return null;
            }
        };
    }
}
