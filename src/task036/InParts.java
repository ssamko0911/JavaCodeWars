package task036;

//https://www.codewars.com/kata/5650ab06d11d675371000003/train/java
public class InParts {
    public static String splitInParts(String str, int partLength) {
        char[] letters = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < letters.length; i++) {
            stringBuilder.append(letters[i]);
            if ((i + 1) % partLength == 0) {
                stringBuilder.append(" ");
            }
        }

        return stringBuilder.toString().trim();
    }
}
