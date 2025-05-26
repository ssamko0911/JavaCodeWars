package task040;

//https://www.codewars.com/kata/580878d5d27b84b64c000b51/train/java
public class Kata {
    public static int sumTriangularNumbers(int n) {
        int count = 0;
        int sum = 0;

        for (int i = 0; i < n + 1; i++) {
            count += i;
            sum += count;
        }

        return sum;
    }
}
