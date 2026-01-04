package task061;

// https://www.codewars.com/kata/5708f682c69b48047b000e07/train/java

public class Kata {
    private static int MULTIPLICATOR = 5;

    public static int multiply(int number) {
        int pow = String.valueOf(Math.abs(number)).length();

        return number * (int) (Math.pow(MULTIPLICATOR, pow));
    }
}
