package task122;

// https://www.codewars.com/kata/5512e5662b34d88e44000060/train/java

import java.util.Arrays;

final public class BrokenSequence {
    public static final int SUCCESS_CODE = 0;
    public static final int ERROR_CODE = 1;

    public static int findMissingNumber(String sequence) {
        if (sequence.isEmpty()) {
            return SUCCESS_CODE;
        }

        String[] sequenceAsArray = sequence.split(" ");
        int[] numbers = new int[sequenceAsArray.length];

        for (int i = 0; i < sequenceAsArray.length; i++) {
            if (Character.isDigit(sequenceAsArray[i].charAt(0))) {
                numbers[i] = Integer.parseInt(sequenceAsArray[i]);
            } else {
                return BrokenSequence.ERROR_CODE;
            }
        }

        Arrays.sort(numbers);

        if (numbers[0] != 1) {
            return BrokenSequence.ERROR_CODE;
        }

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1] + 1) {
                return numbers[i - 1] + 1;
            }
        }

        return BrokenSequence.SUCCESS_CODE;
    }
}
