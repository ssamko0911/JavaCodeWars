package task093;

//https://www.codewars.com/kata/5a090c4e697598d0b9000004/train/java

import java.util.Arrays;

public class Solution {
    public static int[] solve(int[] array) {
        Arrays.sort(array);
        int[] rearrangedArray = new int[array.length];

        int minIndex = 0;
        int maxIndex = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                rearrangedArray[i] = array[maxIndex];
                maxIndex--;
            } else  {
                rearrangedArray[i] = array[minIndex];
                minIndex++;
            }
        }

        return rearrangedArray;
    }
}
