package task038;

import java.util.Arrays;

//https://www.codewars.com/kata/53d32bea2f2a21f666000256/train/java
public class Solution {
    public static int[] largest(int n, int[] arr) {
        Arrays.sort(arr);

        int[] topElements = new int[n];
        int index = 0;
        for (int i = arr.length - n; i < arr.length; i++) {
            topElements[index] = arr[i];
            index++;
        }

        return topElements;
    }
}
