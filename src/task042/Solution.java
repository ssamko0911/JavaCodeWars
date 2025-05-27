package task042;

import java.util.Arrays;

//https://www.codewars.com/kata/556196a6091a7e7f58000018/train/java
public class Solution {
    public static int largestPairSum(int[] numbers){
        Arrays.sort(numbers);

        return numbers[numbers.length - 1] + numbers[numbers.length - 2];
    }
}
