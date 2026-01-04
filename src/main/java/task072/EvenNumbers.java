package task072;

//https://www.codewars.com/kata/55edaba99da3a9c84000003b/train/java

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        if (divider == 0) {
            return new int[0];
        }

        List<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            if (number % divider == 0) {
                list.add(number);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
