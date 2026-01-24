package task063;

// https://www.codewars.com/kata/5fc7d2d2682ff3000e1a3fbc/train/java

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static final String CASE_ZERO = "0";

    public static boolean isAValidMessage(String message) {
        if (message.isEmpty() || message.equals(Kata.CASE_ZERO)) {
            return true;
        }

        if (!Character.isDigit(message.charAt(0)) || Character.isDigit(message.charAt(message.length()-1))) {
            return false;
        }

        char[] chars = message.toCharArray();
        List<Integer> lengths = new ArrayList<>();
        List<String> words = new ArrayList<>();

        StringBuilder tempInt = new StringBuilder();
        StringBuilder tempStr = new StringBuilder();

        for (char character : chars) {
            if (Character.isDigit(character)) {
                Kata.flushWord(tempStr, words);
                tempInt.append(character);
            } else {
                Kata.flushWordLength(tempInt, lengths);
                tempStr.append(character);
            }
        }

        Kata.flushWord(tempStr, words);

        if (lengths.size() != words.size()) {
            return false;
        }

        return Kata.isValidLength(lengths, words);
    }

    private static void flushWord(StringBuilder tempStr, List<String> words) {
        if (!tempStr.isEmpty()) {
            words.add(tempStr.toString());
            tempStr.setLength(0);
        }
    }

    private static void flushWordLength(StringBuilder tempInt,  List<Integer> lengths) {
        if (!tempInt.isEmpty()) {
            lengths.add(Integer.parseInt(tempInt.toString()));
            tempInt.setLength(0);
        }
    }

    private static boolean isValidLength(List<Integer> lengths, List<String> words) {
        for (int i = 0; i < lengths.size(); i++) {
            if (lengths.get(i) != words.get(i).length()) {
                return false;
            }
        }

        return true;
    }
}
