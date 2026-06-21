package task060;

//https://www.codewars.com/kata/5a1a9e5032b8b98477000004/train/java

public class Kata {
    public static int evenLast(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int sum = 0;
        int lastNumber = numbers[numbers.length - 1];

        for (int i = 0; i < numbers.length; i += 2) {
            sum += numbers[i] * lastNumber;
        }

        return sum;
    }
}
