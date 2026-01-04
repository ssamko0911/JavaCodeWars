package task003;

import java.util.Arrays;

//https://www.codewars.com/kata/545afd0761aa4c3055001386

public class ZywOo {
    public static int[] take(int[] arr, int n) {
        if (0 == arr.length) {
            return new int[0];
        }

        if (n > arr.length) {
            return arr;
        }

        return Arrays.copyOfRange(arr, 0, n);
    }
}
