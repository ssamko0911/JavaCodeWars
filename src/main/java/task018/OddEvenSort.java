package task018;

//https://www.codewars.com/kata/580755730b5a77650500010c/train/java
public class OddEvenSort {
    public static String sortMyString(String word) {
        char[] chars = word.toCharArray();
        StringBuilder evens = new StringBuilder();
        StringBuilder odds = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (0 == i % 2) {
                evens.append(chars[i]);
            } else {
                odds.append(chars[i]);
            }
        }

        return String.format("%s %s", evens, odds);
    }
}
