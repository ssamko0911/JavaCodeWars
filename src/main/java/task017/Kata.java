package task017;

//https://www.codewars.com/kata/5a431c0de1ce0ec33a00000c/java
public class Kata {
    public static int[] evenNumbers(int[] array, int length){
        int[] evenNumbers = new int[length];
        int index = length - 1;

        for (int i = array.length - 1; i >= 0; i--) {
            if (0 == array[i] % 2) {
                evenNumbers[index] = array[i];
                index--;
            }

            if (0 > index) {
                break;
            }
        }

        return evenNumbers;
    }
}
