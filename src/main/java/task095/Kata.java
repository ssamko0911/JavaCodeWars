package task095;

//https://www.codewars.com/kata/57f7b8271e3d9283300000b4/train/java

import java.util.Arrays;

public class Kata {
    public static final String EVEN = "Even";
    public static final String ODD = "Odd";
    public static final String GREATER_THAN = "%s is greater than %s";
    public static final String IDENTICAL = "%s and %s are the same";

    public static String evenOrOdd(String str) {
        int[] numbers = Arrays.stream(str.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumOfEven = Arrays.stream(numbers)
                .filter(i -> i % 2 == 0)
                .sum();
        int sumOfOdd = Arrays.stream(numbers)
                .filter(i -> i % 2 != 0)
                .sum();

        if (sumOfEven > sumOfOdd) {
            return String.format(Kata.GREATER_THAN, Kata.EVEN, Kata.ODD);
        } else if (sumOfEven < sumOfOdd) {
            return String.format(Kata.GREATER_THAN, Kata.ODD, Kata.EVEN);
        } else {
            return String.format(Kata.IDENTICAL, Kata.EVEN, Kata.ODD);
        }
    }
}
