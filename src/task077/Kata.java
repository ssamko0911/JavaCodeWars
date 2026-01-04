package src.task077;

//https://www.codewars.com/kata/55d410c492e6ed767000004f/train/java

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Kata {
    final static Set<String> VOWELS = new HashSet<String>(
        Arrays.asList("a", "e", "i", "o", "u")
    );

    public static String vowel2Index(String str) {
        StringBuilder sb = new StringBuilder();
        char[] letters = str.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            if (Kata.VOWELS.contains(String.valueOf(letters[i]))) {
                sb.append(i + 1);
            } else {
                sb.append(letters[i]);
            }
        }

        return sb.toString();
    }
}
