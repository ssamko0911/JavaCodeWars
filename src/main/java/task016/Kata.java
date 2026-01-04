package task016;

import java.util.ArrayList;

//https://www.codewars.com/kata/5680781b6b7c2be860000036/train/java
public class Kata {
    private static final char[] VOWELS = new char[]{'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};

    public static int[] vowelIndices(String word) {
        ArrayList<Integer> vowelIndex = new ArrayList<>();
        char[] wordAsArray = word.toCharArray();

        for (int i = 0; i < wordAsArray.length; i++) {
            if (Kata.inArray(wordAsArray[i])) {
                vowelIndex.add(i + 1);
            }
        }

        return vowelIndex.stream().mapToInt(Integer::intValue).toArray();
    }

    private static boolean inArray(char target) {
        for (char item : Kata.VOWELS) {
            if (target == item) {
                return true;
            }
        }

        return false;
    }
}
