package task111;

//https://www.codewars.com/kata/57cf50a7eca2603de0000090/train/java

public class MoveTen {
    public static final int LAST_CHAR_ASCII_INDEX = 122;
    public static final int ALPHABET_LENGTH = 26;
    public static final int SHIFT = 10;

    public static String moveTen(String str) {
        char[] letters = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (char letter : letters) {
            char newLetter;

            if (letter + MoveTen.SHIFT <= MoveTen.LAST_CHAR_ASCII_INDEX) {
                newLetter = (char) (letter + MoveTen.SHIFT);
            }  else {
                newLetter = (char) (letter + MoveTen.SHIFT - MoveTen.ALPHABET_LENGTH);
            }

            stringBuilder.append(newLetter);
        }

        return stringBuilder.toString();
    }
}
