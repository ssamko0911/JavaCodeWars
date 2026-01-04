package task032;

//https://www.codewars.com/kata/59cfc09a86a6fdf6df0000f1/train/java
public class Kata {
    public static String capitalize(String str, int[] indexes) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] letters = str.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            if (Kata.hasIndex(i, indexes)) {
                stringBuilder.append(Character.toUpperCase(letters[i]));
            } else {
                stringBuilder.append(letters[i]);
            }

        }

        return stringBuilder.toString();
    }

    private static boolean hasIndex(int index, int[] indexes) {
        for(int item : indexes) {
            if (index == item) {
                return true;
            }
        }

        return false;
    }
}
