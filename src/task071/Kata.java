package src.task071;

//https://www.codewars.com/kata/5583090cbe83f4fd8c000051/train/java

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static int[] digitize(long number) {
        if (0 == number) {
            return new int[]{0};
        }

        List<Integer> list = new ArrayList<>();

        while (number > 0) {
            long digit = number % 10;
            list.add((int) digit);
            number = number / 10;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
