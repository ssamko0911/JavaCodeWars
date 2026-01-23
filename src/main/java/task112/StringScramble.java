package task112;

//https://www.codewars.com/kata/5822d89270ca28c85c0000f3/train/java

public class StringScramble {
    public static String scramble(String str, int[] indices) {
        char[] rearrangedChars = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            rearrangedChars[indices[i]] = str.charAt(i);
        }

        return new String(rearrangedChars);
    }
}
