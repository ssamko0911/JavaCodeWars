package task119;

//https://www.codewars.com/kata/59a1cdde9f922b83ee00003b/train/java

public class Kata {
    public static final int LOOKUP_VALUE = 1;

    public static int stantonMeasure(int[] arr) {
        int lookupValueCount = Kata.getValueCount(arr, Kata.LOOKUP_VALUE);

        return Kata.getValueCount(arr, lookupValueCount);
    }

    private static int getValueCount(int[] numbers, int key) {
        int count = 0;

        for (int number : numbers) {
            if (number == key) {
                count++;
            }
        }

        return count;
    }
}
