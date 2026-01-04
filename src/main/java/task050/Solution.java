package task050;

//https://www.codewars.com/kata/598d91785d4ce3ec4f000018/train/java
public class Solution {
    public static final int LOWERCASE_SCORE_BASE = 96;

    public static int[] nameValue(String[] strings) {
        int[] wordValues = new int[strings.length];

        for (int i = 0; i < strings.length; i++) {
            wordValues[i] = Solution.getCharacterSum(strings[i].toCharArray(), i + 1);
        }

        return wordValues;
    }

    private static int getCharacterSum(char[] characters, int position) {
        int sum = 0;

        for (char letter : characters) {
            if (Character.isLetter(letter)) {
                sum += (((int) letter) - Solution.LOWERCASE_SCORE_BASE) * position;
            }
        }

        return sum;
    }
}
