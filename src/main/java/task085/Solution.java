package task085;

//https://www.codewars.com/kata/57f609022f4d534f05000024/train/java

public class Solution {
    static int stray(int[] numbers) {
        int singleNumber = 0;

        for (int number : numbers) {
            singleNumber ^= number;
        }

        return singleNumber;
    }
}
