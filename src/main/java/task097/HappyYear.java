package task097;

//https://www.codewars.com/kata/5ae7e3f068e6445bc8000046/train/java

import java.util.*;
import java.util.stream.Collectors;

public class HappyYear {
    public final static int DISTINCT_DIGITS = 4;

    static public int nextHappyYear(int year) {
        Set<Character> characters = HappyYear.getYearAsCharSet(year);

        if (characters.size() == HappyYear.DISTINCT_DIGITS) {
            year++;
            characters = HappyYear.getYearAsCharSet(year);
        }

        while (characters.size() < HappyYear.DISTINCT_DIGITS) {
            year++;
            characters = HappyYear.getYearAsCharSet(year);
        }

        return year;
    }

    private static Set<Character> getYearAsCharSet(int year) {
        return String.valueOf(year).chars()
                .mapToObj(character -> (char) character)
                .collect(Collectors.toSet());
    }
}
