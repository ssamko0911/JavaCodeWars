package task024;

//https://www.codewars.com/kata/585b1fafe08bae9988000314
public class Solution {
    public static String explode(String digits) {
        StringBuilder extendedDigits = new StringBuilder();
        char[] numbers = digits.toCharArray();

        for (char letter : numbers) {
            int repeat = Integer.parseInt(String.valueOf(letter));
            extendedDigits.append(String.valueOf(letter).repeat(repeat));
        }

        return extendedDigits.toString();
    }
}
