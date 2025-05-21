package task031;

import java.util.Arrays;

//https://www.codewars.com/kata/5769b3802ae6f8e4890009d2/train/java
public class Kata {
    public static Object[] removeEveryOther(Object[] arr) {
        int length = 0 == arr.length % 2 ? arr.length / 2 : (arr.length / 2) + 1;
        Object[] keep = new Object[length];
        int index = 0;
        keep[index++] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (0 == i % 2) {
                keep[index++] = arr[i];
            }
        }

        return keep;
    }
}
