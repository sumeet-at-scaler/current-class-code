package FairWork.Lect_Begin_Streams.Lambdas;

import java.util.function.BiPredicate;

public class DemoClassForBiP implements BiPredicate<Integer, String> {
    @Override
    public boolean test(Integer integer, String s) {
        return false;
    }
}
