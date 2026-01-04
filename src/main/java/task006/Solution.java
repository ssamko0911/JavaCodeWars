package task006;

import java.util.*;

// https://www.codewars.com/kata/57a5b0dfcf1fa526bb000118/train/java
public class Solution {
    public static int[] distinct(int[] array) {
        Set<Integer> uniqueSet = new LinkedHashSet<>();

        for (int num : array) {
            uniqueSet.add(num);
        }

        int[] numbers = new int[uniqueSet.size()];
        int i = 0;

        for (int num : uniqueSet) {
            numbers[i++] = num;
        }

        return numbers;
    }
}
