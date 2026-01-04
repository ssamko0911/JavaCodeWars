package task044;

public class PhoneNumberValidator {
    public static final int FULL_PHONE_NUMBER_LENGTH = 14;
    public static final int CODE_LENGTH = 5;
    public static final int PHONE_NUMBER_LENGTH = 8;
    public static final char[] SPECIAL_SYMBOLS = new char[]{'(', ')', ' ', '-'};
    public static final String CODE_PATTERN = "\\(\\d+\\)";
    public static final String PHONE_NUMBER_PATTERN = "\\d{3}-\\d{4}";

    public static boolean validateLength(String inputString, int length) {
        return length == inputString.length();
    }

    public static boolean validatePhoneNumberPart(String phoneNumberCode, String pattern) {
        return phoneNumberCode.matches(pattern);
    }

    public static boolean validateSpecialSymbols(String phoneNumber) {
        for (char specialSymbol : PhoneNumberValidator.SPECIAL_SYMBOLS) {
            if (!validateSpecialSymbol(phoneNumber, specialSymbol)) {
                return false;
            }
        }

        return true;
    }

    private static boolean validateSpecialSymbol(String phoneNumber, char specialSymbol) {
        char[] phoneNumberAsArray = phoneNumber.toCharArray();
        int charCount = 0;

        for(char character : phoneNumberAsArray) {
           if (specialSymbol == character) {
               charCount++;
           }
        }

        return 1 == charCount;
    }
}
