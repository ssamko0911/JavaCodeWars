package task120;

//https://www.codewars.com/kata/5a995c2aba1bb57f660001fd/train/java

public class Kata {
    public static String[] scrollingText(String text) {
        String textUpperCase = text.toUpperCase();

        String[] textArray = new String[textUpperCase.length()];
        textArray[0] = textUpperCase;

        for (int i = 1; i < textUpperCase.length(); i++) {
            textArray[i] = textUpperCase.substring(i) + textUpperCase.substring(0, i);
        }

        return textArray;
    }
}
