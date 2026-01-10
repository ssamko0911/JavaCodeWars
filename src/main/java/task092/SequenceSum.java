package task092;

public class SequenceSum {
    public static int[] sumOfN(int number) {
        int arrayLength = Math.abs(number) + 1;
        int[] sequence = new int[arrayLength];
        int sum = 0;

        for (int i = 0; i < arrayLength; i++) {
            sum += i;
            sequence[i] = sum * (number > 0 ? 1 : -1);
        }

        return sequence;
    }
}
