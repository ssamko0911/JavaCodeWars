package task027;

//https://www.codewars.com/kata/5a29a0898f27f2d9c9000058/train/java
public class Kata {
    public static int[] solve(String word) {
        int countUpperCase = 0;
        int countLowerCase = 0;
        int countNumbers = 0;
        int countSpecialChars = 0;

        char[] letters = word.toCharArray();

        for (char letter : letters) {
            if (Character.isUpperCase(letter)) {
                countUpperCase++;
            }

            if (Character.isLowerCase(letter)) {
                countLowerCase++;
            }

            if (Character.isDigit(letter)) {
                countNumbers++;
            }

            if (!Character.isLetterOrDigit(letter)) {
                countSpecialChars++;
            }
        }

        return new int[]{countUpperCase, countLowerCase, countNumbers, countSpecialChars};
    }
}
