package task052;

//https://www.codewars.com/kata/5583d268479559400d000064/train/java
public class Solution {
    public static final int BYTE_SIZE = 8;
    public static final int[] MAP = new int[]{128, 64, 32, 16, 8, 4, 2, 1};

    public static String binaryToText(String binary) {
        if (binary.isEmpty()) {
            return "";
        }

        StringBuilder converted = new StringBuilder();
        String[] bytes = Solution.getByteStrings(binary);

        for (String item : bytes) {
            converted.append((char) Solution.getCharacterCode(item));
        }

        return converted.toString();
    }

    private static String[] getByteStrings(String binaries) {
        String[] bytes = new String[binaries.length() / Solution.BYTE_SIZE];
        int index = 0;
        int lengthIncrementer = 0;

        while (lengthIncrementer + Solution.BYTE_SIZE <= binaries.length()) {
            bytes[index] = binaries.substring(lengthIncrementer, lengthIncrementer + Solution.BYTE_SIZE);
            lengthIncrementer += Solution.BYTE_SIZE;
            index++;
        }

        return bytes;
    }

    private static int getCharacterCode(String binary) {
        int charCode = 0;
        char[] binaryAsArray = binary.toCharArray();

        for (int i = 0; i < binaryAsArray.length; i++) {
            if ('1' == binaryAsArray[i]) {
                charCode += Solution.MAP[i];
            }
        }

        return charCode;
    }
}
