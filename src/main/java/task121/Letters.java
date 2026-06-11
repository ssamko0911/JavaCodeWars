package task121;

// https://www.codewars.com/kata/52dbae61ca039685460001ae/train/java

import java.util.Locale;

public class Letters {
    public static final int ALPHABET_SIZE = 26;

    public static String search(String line) {
        char[] letters = line.toLowerCase(Locale.ROOT).toCharArray();

        StringBuilder result = new StringBuilder("0".repeat(ALPHABET_SIZE));

        for (char letter : letters) {
            if (Character.isLetter(letter)) {
                int index = letter - 'a';
                if (result.charAt(index) != '1') {
                    result.setCharAt(index, '1');
                }
            }
        }

        return result.toString();
    }
}
