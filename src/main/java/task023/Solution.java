package task023;

//https://www.codewars.com/kata/5208f99aee097e6552000148/train/java
public class Solution {
    public static String camelCase(String input) {
        char[] letters = input.toCharArray();
        StringBuilder spaced = new StringBuilder();

        for (char letter : letters) {
            if (Character.isUpperCase(letter)) {
                spaced.append(' ');
            }
            spaced.append(letter);
        }

        return spaced.toString();
    }
}
