package task035;

//https://www.codewars.com/kata/544a54fd18b8e06d240005c0/train/java
public class Codewars {
    public static final String INDEX_MODE = "index";

    public static int findSmallest(int[] numbers, String mode) {
        int[] minData = findMinValueIndex(numbers);
        if (Codewars.INDEX_MODE.equalsIgnoreCase(mode)) {
            return minData[1];
        } else {
            return minData[0];
        }
    }

    public static int[] findMinValueIndex(int[] numbers) {
        int min = numbers[0];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                index = i;
            }
        }

        return new int[]{min, index};
    }
}
