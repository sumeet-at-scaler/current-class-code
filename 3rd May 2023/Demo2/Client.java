package FairWork.Lecture4_Inter_OOPs.Demo2;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        int[] arr = {20, 5, 34, 9, 16};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println(CustomMath.abs(-5));
    }
}
