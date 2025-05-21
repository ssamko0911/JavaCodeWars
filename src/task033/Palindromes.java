package task033;

//https://www.codewars.com/kata/54bb6f887e5a80180900046b/train/java
public class Palindromes {
    public static int longestPalindrome(final String str) {
        if (Validator.validateEmptyString(str)) {
            return 0;
        }

        int longestPalindrome = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String part = str.substring(i, j);

                if (Validator.isPalindrome(part)) {
                    if (part.length() > longestPalindrome) {
                        longestPalindrome = part.length();
                    }
                }
            }

        }

        if (Validator.isPalindrome(str) && str.length() > longestPalindrome) {
            longestPalindrome = str.length();
        }

        return longestPalindrome;
    }
}
