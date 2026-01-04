package task021;

//https://www.codewars.com/kata/5a87449ab1710171300000fd/train/java
public class Solution {
    public static boolean tidyNumber(int number) {
        System.out.println(number);

        int[] digits = Solution.getNumberAsArray(number);

        for (int i = 1; i < digits.length; i++) {
            if (digits[i] < digits[i - 1]) {
                return false;
            }
        }

        return true;
    }

    private static int[] getNumberAsArray(int number) {
        String numberAsString = String.valueOf(number);
        char[] numberAsArray = numberAsString.toCharArray();

        int[] digits = new int[numberAsString.length()];
        for (int i = 0; i < numberAsArray.length; i++) {
            digits[i] = Character.getNumericValue(numberAsArray[i]);
        }

        return digits;
    }
}
