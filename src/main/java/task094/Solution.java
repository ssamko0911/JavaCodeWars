package task094;

//https://www.codewars.com/kata/5a262cfb8f27f217f700000b/train/java

public class Solution {
    public static String solve(String firstString, String secondString) {
        return Solution.getUniqueChars(firstString, secondString) + Solution.getUniqueChars(secondString, firstString);
    }

    private static String getUniqueChars(String firstString, String secondString) {
        char[] charArray = firstString.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (char character : charArray) {
            if (!secondString.contains(String.valueOf(character))) {
                stringBuilder.append(character);
            }
        }

        return stringBuilder.toString();
    }
}
