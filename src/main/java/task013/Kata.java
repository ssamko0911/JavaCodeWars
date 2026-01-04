package task013;

//https://www.codewars.com/kata/5d5ee4c35162d9001af7d699/train/java
public class Kata {
    public static int sumOfMinimums(int[][] arr){
        int sum = 0;

        for (int[] array : arr) {
            sum += Kata.getMin(array);
        }

        return sum;
    }

    private static int getMin(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    static void main() {
        System.out.println(sumOfMinimums(new int[][]{}));
    }
}
