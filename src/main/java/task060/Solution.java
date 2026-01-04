package task060;

//https://www.codewars.com/kata/5bd00c99dbc73908bb00057a/train/java

import java.util.Arrays;

public class Solution {
    private static final int ASCII_LETTERS_START = 65;

    public static String alphaSeq(String str) {
        String[] repeatedAsArray = new String[str.length()];
        char[] charsArray = str.toCharArray();

        for (int i = 0; i < charsArray.length; i++) {
            String firstLetter = String.valueOf(charsArray[i]).toUpperCase();
            int charIndex = Character.toUpperCase(charsArray[i]);
            repeatedAsArray[i] = firstLetter + firstLetter.toLowerCase().repeat(charIndex - ASCII_LETTERS_START) ;
        }

        Arrays.sort(repeatedAsArray);

        return String.join(",", repeatedAsArray);
    }
}
