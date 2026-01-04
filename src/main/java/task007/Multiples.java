package task007;

//https://www.codewars.com/kata/58ca658cc0d6401f2700045f/train/java
public class Multiples {
    public static int[] find(int base, int limit) {
        int[] range = new int[limit / base];

        for (int i = 0; i < range.length; i++) {
            range[i] = base * (i + 1);
        }

        return range;
    }
}

