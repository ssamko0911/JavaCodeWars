package task030;

//https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java
public class Order {
    public static String order(String words) {
        if (words.isEmpty()) {
            return words;
        }

        String[] wordsAsArray = words.split(" ");
        String[] orderedWords = new String[wordsAsArray.length];

        for (String word : wordsAsArray) {
            int index = Order.getWordPosition(word);

            if (0 != index) {
                orderedWords[index - 1] = word;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < orderedWords.length; i++) {
            stringBuilder.append(orderedWords[i]);

            if (orderedWords.length - 1 != i) {
                stringBuilder.append(" ");
            }
        }

        return stringBuilder.toString();
    }

    public static int getWordPosition(String word) {
        char[] letters = word.toCharArray();

        for (char letter : letters) {
            if (Character.isDigit(letter)) {
                return Integer.parseInt(String.valueOf(letter));
            }
        }

        return 0;
    }
}
