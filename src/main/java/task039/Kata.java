package task039;

//https://www.codewars.com/kata/54a91a4883a7de5d7800009c/train/java
public class Kata {
    public static String incrementString(String str) {
        String numberAsString = Kata.extractDigits(str);
        int charCount = numberAsString.length();
        long number;

        if (0 == charCount) {
            return str + 1;
        } else {
            number = Integer.parseInt(numberAsString);
            number++;
        }

        String letters = Kata.extractLetters(str, charCount);

        return Kata.buildIncrementedString(letters, number, charCount);
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

    public static String buildIncrementedString(String letters, long number, int numberLength) {
        if (String.valueOf(number).length() < numberLength) {
            return letters + "0".repeat(numberLength - String.valueOf(number).length()) + number;
        } else {
            return letters + number;
        }
    }
}
