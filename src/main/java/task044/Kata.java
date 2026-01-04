package task044;

//https://www.codewars.com/kata/525f47c79f2f25a4db000025/train/java
public class Kata {
    public static boolean validPhoneNumber(String phoneNumber) {
        if (!PhoneNumberValidator.validateLength(phoneNumber, PhoneNumberValidator.FULL_PHONE_NUMBER_LENGTH)){
            return false;
        }

        if (!PhoneNumberValidator.validateSpecialSymbols(phoneNumber)) {
            return false;
        }

        String[] parts = phoneNumber.split(" ");

        if (!PhoneNumberValidator.validateLength(parts[0], PhoneNumberValidator.CODE_LENGTH)) {
            return false;
        }

        if (!PhoneNumberValidator.validatePhoneNumberPart(parts[0], PhoneNumberValidator.CODE_PATTERN)) {
            return false;
        }

        if (!PhoneNumberValidator.validateLength(parts[1], PhoneNumberValidator.PHONE_NUMBER_LENGTH)) {
            return false;
        }

        if (!PhoneNumberValidator.validatePhoneNumberPart(parts[1], PhoneNumberValidator.PHONE_NUMBER_PATTERN)) {
            return false;
        }

        return true;
    }
}
