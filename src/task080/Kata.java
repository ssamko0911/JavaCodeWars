package src.task080;

//https://www.codewars.com/kata/559cc2d2b802a5c94700000c/train/java

import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {
    public static int consecutive(final int[] arr) {
        if  (0 == arr.length) {
            return 0;
        }

        Arrays.sort(arr);
        int[] fullArray = IntStream.range(arr[0], arr[arr.length - 1] + 1).toArray();

        return fullArray.length - arr.length;
    }
}
