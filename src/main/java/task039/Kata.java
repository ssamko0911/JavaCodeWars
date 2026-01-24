package task039;

import java.math.BigInteger;

//https://www.codewars.com/kata/54a91a4883a7de5d7800009c/train/java

public class Kata {
    public static String incrementString(String str) {
        String numberAsString = Kata.extractDigits(str);
        int charCount = numberAsString.length();

        if (0 == charCount) {
            return str + 1;
        }

        BigInteger number = new BigInteger(numberAsString);
        number = number.add(BigInteger.ONE);

        String letters = Kata.extractLetters(str, charCount);

        return Kata.buildIncrementedString(letters, number.toString(), charCount);
    }

    public static String extractDigits(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        String reversed = stringBuilder.reverse().toString();
        char[] letters = reversed.toCharArray();
        stringBuilder.setLength(0);

        for (char letter : letters) {
            if (!Character.isDigit(letter)) {
                break;
            } else {
                stringBuilder.append(letter);
            }
        }

        return stringBuilder.reverse().toString();
    }

    public static String extractLetters(String str, int numberLength) {
        return str.substring(0, str.length() - numberLength);
    }

    public static String buildIncrementedString(String letters, String number, int originalNumberLength) {
        if (number.length() < originalNumberLength) {
            return letters + "0".repeat(originalNumberLength - number.length()) + number;
        } else {
            return letters + number;
        }
    }
}
