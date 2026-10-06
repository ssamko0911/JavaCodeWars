package task127;

//https://www.codewars.com/kata/5168b125faced29f66000005/train/java
public final class Solution {
    public static int substringCount(String fullText, String search) {
        int count = 0;
        int startingIndex = 0;
        int startingChar = search.charAt(0);
        int textLength = fullText.length();
        int searchLength = search.length();

        while (startingIndex < textLength) {
            if (fullText.charAt(startingIndex) == startingChar && fullText.startsWith(search, startingIndex)) {
                count++;
                startingIndex = startingIndex + searchLength;
            } else {
                startingIndex++;
            }
        }

        return count;
    }
}
