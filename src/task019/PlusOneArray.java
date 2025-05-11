package task019;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://www.codewars.com/kata/5514e5b77e6b2f38e0000ca9/train/java
public class PlusOneArray {
    public static int[] upArray(final int[] arr) {
        if (!PlusOneArray.isValidArray(arr)) {
            return null;
        }

        String arrayAsNumber = PlusOneArray.getBaseNumber(arr);

        int[] digits = new int[arrayAsNumber.length()];

        for (int i = 0; i < arrayAsNumber.length(); i++) {
            digits[i] = Character.getNumericValue(arrayAsNumber.charAt(i));
        }

        return PlusOneArray.incrementDigits(digits);
    }

    private static boolean isValidArray(int[] numbers) {
        if (0 == numbers.length) {
            return false;
        }

        if (PlusOneArray.hasNegativeGigits(numbers)) {
            return false;
        }

        if (PlusOneArray.hasTwoDigits(numbers)) {
            return false;
        }

        return true;
    }

    private static boolean hasNegativeGigits(int[] numbers) {
        for (int number : numbers) {
            if (0 > number) {
                return true;
            }
        }

        return false;
    }

    private static boolean hasTwoDigits(int[] numbers) {
        for (int number : numbers) {
            if (10 <= number) {
                return true;
            }
        }

        return false;
    }

    private static String getBaseNumber(int[] numbers) {
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            number.append(numbers[i]);
        }

        return number.toString();
    }

    private static int[] incrementDigits(int[] digits) {
        int carry = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            // Need to expand the array to add carry at the beginning
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = carry;
            System.arraycopy(digits, 0, newDigits, 1, digits.length);
            return newDigits;
        }

        return digits;
    }
}
