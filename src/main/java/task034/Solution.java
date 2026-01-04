package task034;

//https://www.codewars.com/kata/5a3e1319b6486ac96f000049/train/java
public class Solution {
    public static int solve(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                if (Solution.isConsecutive(arr[i - 1], arr[i])) {
                    count++;
                }
            }
        }

        return count;
    }

    public static boolean isConsecutive(int numberOne, int numberTwo) {
        return numberOne + 1 == numberTwo
                || numberTwo + 1 == numberOne
                || numberOne - 1 == numberTwo
                || numberTwo - 1 == numberOne;
    }
}
