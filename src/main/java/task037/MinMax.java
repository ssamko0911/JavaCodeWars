package task037;

import java.util.List;

//https://www.codewars.com/kata/57a1ae8c7cb1f31e4e000130/train/java
public class MinMax {
    static int[] getMinMax(List<Integer> list) {
        int min = list.getFirst();
        int max = list.getFirst();

        for (int item : list) {
            if (item < min) {
                min = item;
            }

            if (item > max) {
                max = item;
            }
        }

        return new int[] {min, max};
    }
}
