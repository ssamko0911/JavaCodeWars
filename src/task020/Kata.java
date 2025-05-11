package task020;

//https://www.codewars.com/kata/56747fd5cb988479af000028/train/java
class Kata {
    public static String getMiddle(String word) {
        char[] letters = word.toCharArray();
        int middle = letters.length / 2;

        if (0 != word.length() % 2) {
            return String.valueOf(letters[middle]);
        } else {
            return String.valueOf(letters[middle - 1]) + letters[middle];
        }
    }
}
