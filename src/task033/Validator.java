package task033;

public class Validator {
    public static boolean validateEmptyString(String string) {
        return string.isEmpty();
    }

    public static boolean validateEntireString(String string, int longestPalindrome) {
        return Validator.isPalindrome(string) && string.length() > longestPalindrome;
    }

    public static boolean isPalindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);

        return str.contentEquals(stringBuilder.reverse());
    }
}
