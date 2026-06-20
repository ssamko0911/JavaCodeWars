package task123;

// https://www.codewars.com/kata/5637b03c6be7e01d99000046/train/java

import java.util.Locale;

public class Kata {
    public static final String SEPARATOR = " ";
    public static final char O_SUBSTITUTION = '0';
    public static final char I_SUBSTITUTION = '1';
    public static final char S_SUBSTITUTION = '5';

    public static String makePassword(String phrase) {
        StringBuilder password = new StringBuilder();

        if (phrase.isEmpty()) {
            return password.toString();
        }

        String trimmed = phrase.trim();
        String[] passPhraseAsArray = trimmed.split(SEPARATOR);
        for (String word : passPhraseAsArray) {
            password.append(Kata.getPasswordChar(word));
        }

//        int start = 0;
//        int separatorPosition = trimmed.indexOf(Kata.SEPARATOR, start);
//
//        while (separatorPosition != -1) {
//            String word = trimmed.substring(start, separatorPosition);
//            password.append(Kata.getPasswordChar(word));
//            start = separatorPosition + 1;
//            separatorPosition = trimmed.indexOf(" ", start);
//        }
//
//        password.append(Kata.getPasswordChar(trimmed.substring(start)));

        return password.toString();
    }

    private static char getPasswordChar(String word) {
        return switch (word.toLowerCase(Locale.ROOT).charAt(0)) {
            case 'o' -> Kata.O_SUBSTITUTION;
            case 'i' -> Kata.I_SUBSTITUTION;
            case 's' -> Kata.S_SUBSTITUTION;
            default -> word.charAt(0);
        };
    }
}
