package task053;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://www.codewars.com/kata/5a523566b3bfa84c2e00010b/train/java
public class Solution {
    private static final int MAP_MIN_INDEX = 0;
    private static final int MAP_MAX_INDEX = 1;
    private static final int MIN_LIST_SIZE = 2;

    public static int minSum(int[] passed) {
        List<Integer> integers = Solution.getNumbersAsList(passed);

        int sum = 0;

        while (Solution.MIN_LIST_SIZE != integers.size()) {
            sum += Collections.min(integers) * Collections.max(integers);
            int[] indexes = Solution.getIndexesOfMinAndMax(integers);

            Solution.updateList(indexes, integers);
        }

        sum += integers.getFirst() * integers.getLast();

        return sum;
    }

    private static List<Integer> getNumbersAsList(int[] numbers) {
        return new java.util.ArrayList<>(Arrays.stream(numbers)
                .boxed()
                .toList());
    }

    private static int[] getIndexesOfMinAndMax (List<Integer> integers) {
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) < integers.get(minIndex)) {
                minIndex = i;
            }

            if (integers.get(i) > integers.get(maxIndex)) {
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    private static void updateList(int[] indexes, List<Integer> list) {
        if (indexes[Solution.MAP_MIN_INDEX] > indexes[Solution.MAP_MAX_INDEX]) {
            list.remove(indexes[Solution.MAP_MIN_INDEX]);
            list.remove(indexes[Solution.MAP_MAX_INDEX]);
        } else {
            list.remove(indexes[Solution.MAP_MAX_INDEX]);
            list.remove(indexes[Solution.MAP_MIN_INDEX]);
        }
    }
}
