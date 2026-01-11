package task091;

//https://www.codewars.com/kata/5bbb8887484fcd36fb0020ca/train/java

public class Solution {
    public static int signChange(int[] arr) {
        int signChangeCount = 0;

        if (arr.length == 0) {
            return signChangeCount;
        }

        boolean previousIsPositive = Solution.isNonNegative(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            boolean currentIsPositive = Solution.isNonNegative(arr[i]);
            if (previousIsPositive != currentIsPositive) {
                signChangeCount++;
                previousIsPositive = currentIsPositive;
            }
        }

        return signChangeCount;
    }

    public static boolean isNonNegative(int number) {
        return number >= 0;
    }
}
