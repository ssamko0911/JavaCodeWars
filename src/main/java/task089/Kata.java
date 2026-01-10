package task089;

//https://www.codewars.com/kata/5a91a7c5fd8c061367000002/train/java

import java.util.Arrays;

public class Kata {
    public static int minimumSteps(int[] numbers, int k) {
        int iterationsCount = 0;
        Arrays.sort(numbers);
        int sum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
            iterationsCount++;
            if (sum >= k) {
                return iterationsCount;
            }
        }

        return 1 == iterationsCount ? 0 : iterationsCount;
    }
}
