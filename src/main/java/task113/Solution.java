package task113;

//https://www.codewars.com/kata/5993fb6c4f5d9f770c0000f2/train/java

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int sumNoDuplicates(int[] arr) {
        Map<Integer, Integer> digitOccurrenceCount = new HashMap<>();

        for (int j : arr) {
            digitOccurrenceCount.put(j, digitOccurrenceCount.getOrDefault(j, 0) + 1);
        }

        int sum = 0;

        for (Map.Entry<Integer, Integer> entry : digitOccurrenceCount.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }

        return sum;
    }
}
