package task116;

//https://www.codewars.com/kata/55960bbb182094bc4800007b/train/java

public class Solution {
    public static final String ODD_SEPARATOR = "-";

    public static String insertDash(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(digits[0]));

        for (int i = 1; i < digits.length; i++) {
            int previousDigit = Character.getNumericValue(digits[i - 1]);
            int currentDigit = Character.getNumericValue(digits[i]);

            if (isOdd(previousDigit) && isOdd(currentDigit)) {
                stringBuilder.append(Solution.ODD_SEPARATOR);
            }

            stringBuilder.append(digits[i]);
        }

        return stringBuilder.toString();
    }

    private static boolean isOdd(int num) {
        return num % 2 == 1;
    }
}
