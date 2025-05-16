package task026;

//https://www.codewars.com/kata/569d488d61b812a0f7000015/train/java
public class Kata {
    private static final int BYTE_SIZE = 8;

    public static int[] dataReverse(int[] binaries) {
        if (0 == binaries.length) {
            return new int[0];
        }

        String reversedDataAsString = Kata.getDataAsReversedString(binaries);
        char[] digits = reversedDataAsString.toCharArray();
        int[] reversedArray = new int[binaries.length];

        for (int i = 0; i < digits.length; i++) {
            reversedArray[i] = Character.getNumericValue(digits[i]);
        }

        return reversedArray;
    }

    private static String getDataAsReversedString(int[] binaries) {
        String[] parts = new String[binaries.length / Kata.BYTE_SIZE];
        StringBuilder stringBuilder = new StringBuilder();

        int index = 0;
        for (int binary : binaries) {
            stringBuilder.append(binary);
            if (Kata.BYTE_SIZE == stringBuilder.length()) {
                parts[index] = stringBuilder.toString();
                stringBuilder.setLength(0);
                index++;
            }
        }

        for (int i = parts.length - 1; i >= 0; i--) {
            stringBuilder.append(parts[i]);
        }

        return stringBuilder.toString();
    }
}
