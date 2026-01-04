package task045;

//https://www.codewars.com/kata/55b051fac50a3292a9000025/train/java
public class Kata {
    public static long filterString(final String value) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] letters = value.toCharArray();

        for (char letter : letters) {
            if (Character.isDigit(letter)) {
                stringBuilder.append(letter);
            }
        }

        return Long.parseLong(stringBuilder.toString());
    }
}
