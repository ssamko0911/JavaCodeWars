package task054;

//https://www.codewars.com/kata/59fca81a5712f9fa4700159a/train/java

public class Kata {
    private static final int BASE = 2;

    public static int toBinary(int number) {
        StringBuilder binaryAsString = new StringBuilder();

        while (0 != number) {
            binaryAsString.append(number % BASE);
            number /= BASE;
        }

        String reversed = binaryAsString.reverse().toString();

        return Integer.parseInt(reversed);
    }
}
