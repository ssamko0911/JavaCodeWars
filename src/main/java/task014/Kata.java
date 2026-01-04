package task014;

//https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/train/java
public class Kata {
    public static String reverseWords(final String original) {
        StringBuilder word = new StringBuilder();
        StringBuilder sentence = new StringBuilder();

        for (char character : original.toCharArray()) {
            if (!Character.isWhitespace(character)) {
                word.append(character);
            } else {
                if (!word.isEmpty()) {
                    sentence.append(word.reverse());
                    word.setLength(0);
                }
                sentence.append(character);
            }
        }

        if (!word.isEmpty()) {
            sentence.append(word.reverse());
        }

        return sentence.toString();
    }
}
