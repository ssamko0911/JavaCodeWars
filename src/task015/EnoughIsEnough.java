package task015;

import java.util.ArrayList;

public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int element : elements) {
            int numberOccurrence = EnoughIsEnough.countOccurrences(numbers, element);

            if (maxOccurrences > numberOccurrence) {
                numbers.add(element);
            }
        }

        return numbers.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int countOccurrences(ArrayList<Integer> array, int target) {
        int count = 0;

        for (Integer item : array) {
            if (target == item) {
                count++;
            }
        }

        return count;
    }
}
