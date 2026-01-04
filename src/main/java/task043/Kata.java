package task043;

//https://www.codewars.com/kata/56582133c932d8239900002e/train/java
public class Kata {
    public static int mostFrequentItemCount(int[] collection) {
        if (0 == collection.length) {
            return 0;
        }

        int frequencyCount = 0;
        int temp = 0;

        for (int j : collection) {
            for (int k : collection) {
                if (j == k) {
                    temp++;
                }
            }

            if (temp > frequencyCount) {
                frequencyCount = temp;
            }

            temp = 0;
        }

        return frequencyCount;
    }
}
