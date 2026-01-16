package task106;

//https://www.codewars.com/kata/56eb0be52caf798c630013c0/train/java

import java.time.LocalDate;

public class Kata {
    public static final String UNLUCKY_DAY = "FRIDAY";
    public static final int MONTHS = 12;
    public static final int DATE = 13;

    public static int unluckyDays(int year) {
        int unluckyDays = 0;

        for (int i = 0; i < Kata.MONTHS; i++) {
            String day = LocalDate.of(year, i + 1, Kata.DATE).getDayOfWeek().toString();

            if (day.equals(UNLUCKY_DAY)) {
                unluckyDays++;
            }
        }

        return unluckyDays;
    }
}
