package task025;

//https://www.codewars.com/kata/59590976838112bfea0000fa/train/java
public class Kata {
    public static int[] beggars(int[] values, int n) {
        if (0 == n) {
            return new int[0];
        }

        int[] sums = new int[n];

        for (int i = 0; i < values.length; i++) {
            if (i < n) {
                sums[i] += values[i];
            } else {
                int index = i % n;
                sums[index] += values[i];
            }
        }

        return sums;
    }
}
