package task083;

//https://www.codewars.com/kata/5738f5ea9545204cec000155/train/java

public class Kata {
    public static int countLettersAndDigits(String input){
        char[] charArray = input.toCharArray();
        int alphaNumericCounter = 0;

        for (char character : charArray) {
            if (Character.isAlphabetic(character)) {
                alphaNumericCounter++;
            } else if (Character.isDigit(character)) {
                alphaNumericCounter++;
            }
        }

        return alphaNumericCounter;
    }
}
