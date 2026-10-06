package task126;

// https://www.codewars.com/kata/58539230879867a8cd00011c/train/java

import java.util.Arrays;

public class WhereIsMyParent {
    public static String findChildren(final String text) {
        if (text.isEmpty()) {
            return text;
        }

        String lowerCaseText = text.toLowerCase();
        char[] letters = lowerCaseText.toCharArray();
        Arrays.sort(letters);

        StringBuilder sb = new StringBuilder();

        int counter = 0;
        sb.append(Character.toUpperCase(letters[counter]));
        counter++;

        do {
            if (letters[counter] == letters[counter - 1]) {
                sb.append(letters[counter]);
            } else {
                sb.append(Character.toUpperCase(letters[counter]));
            }
            counter++;
        } while (counter < letters.length);

        return sb.toString();
    }
}
