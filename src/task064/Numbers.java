package src.task064;

//https://www.codewars.com/kata/5641c3f809bf31f008000042/train/java

public class Numbers {
    public static final int DECIMAL_DIGITS = 2;

    public static double twoDecimalPlaces(double number)
    {
        String numberAsString = Double.toString(number);
        int periodIndex = numberAsString.indexOf(".");
        String formattedNumber = numberAsString.substring(0, periodIndex + Numbers.DECIMAL_DIGITS + 1);

        return Double.parseDouble(formattedNumber);
    }
}
