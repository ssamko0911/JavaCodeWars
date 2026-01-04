package task084;

//https://www.codewars.com/kata/54557d61126a00423b000a45/train/java

public class ReverseLonger {
    public static String shorterReverseLonger(String strOne, String strTwo) {
        int strOneLength = strOne.length();
        int strTwoLength = strTwo.length();

        if (strOneLength >= strTwoLength) {
            return String.format("%s%s%s",
                    strTwo, new StringBuffer(strOne).reverse(), strTwo
            );
        }

        return String.format("%s%s%s",
                strOne, new StringBuffer(strTwo).reverse(), strOne
        );
    }
}
