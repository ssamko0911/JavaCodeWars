package task098;

//https://www.codewars.com/kata/62a611067274990047f431a8/train/java

public class Kata {
    public static String[] alternate(int n, String firstValue, String secondValue) {
        String[] array = new String[n];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                array[i] = firstValue;
            } else {
                array[i] = secondValue;
            }
        }

        return array;
    }
}
