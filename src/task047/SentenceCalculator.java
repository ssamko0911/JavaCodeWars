package task047;

//https://www.codewars.com/kata/5970fce80ed776b94000008b/train/java
public class SentenceCalculator {
    public static final int LOWERCASE_SCORE_BASE = 96;
    public static final int UPPERCASE_SCORE_BASE = 64;

    public static int lettersToNumbers(String phrase) {
        char[] charArray = phrase.toCharArray();
        int score = 0;

        for (char character : charArray) {
            if (Character.isLetter(character)) {
                score += SentenceCalculator.getLetterCharacterScore(character);
            }

            if (Character.isDigit(character)) {
                score += SentenceCalculator.getDigitCharacterScore(character);
            }
        }

        return score;
    }

    private static int getLetterCharacterScore(char character) {
        if (Character.isLowerCase(character)) {
            return ((int) character) - SentenceCalculator.LOWERCASE_SCORE_BASE;
        }

        return (((int) character) - SentenceCalculator.UPPERCASE_SCORE_BASE) * 2;
    }

    private static int getDigitCharacterScore(char character) {
        return Character.getNumericValue(character);
    }
}
