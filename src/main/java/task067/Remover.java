package task067;

// https://www.codewars.com/kata/563cf89eb4747c5fb100001b/train/java

public class Remover {
    public static int[] removeSmallest(int[] numbers) {
        if (numbers.length == 0) {
            return new int[0];
        }

        int[] removedMinArray = new int[numbers.length - 1];
        int minIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
        }

        System.arraycopy(numbers, 0, removedMinArray, 0, minIndex);
        System.arraycopy(numbers, minIndex + 1, removedMinArray, minIndex, numbers.length - minIndex - 1);

        return removedMinArray;
    }
}
