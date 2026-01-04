package task065;

//https://www.codewars.com/kata/58e0f0bf92d04ccf0a000010/solutions/java

import java.util.Arrays;

public class Kata {
    public static int lostSheep(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepTotal) {
        return sheepTotal - (Kata.getDailyTotal(fridayNightCounting) + Kata.getDailyTotal(saturdayNightCounting)) ;
    }

    private static int getDailyTotal(int[] dailyCounting) {
        int total = 0;

        if (dailyCounting.length == 0) {
            return total;
        }

        return Arrays.stream(dailyCounting).sum();
    }
}
