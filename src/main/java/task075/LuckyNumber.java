package task075;

//https://www.codewars.com/kata/55afed09237df73343000042/train/java

public class LuckyNumber {
    final static private int DIVISOR = 9;

    public static boolean isLucky(long number) {
        int sum = 0;

        while(number != 0) {
            int digit = (int) (number % 10);
            sum += digit;
            number /= 10;
        }

        if (0 == sum) {
            return true;
        }

        return sum % DIVISOR == 0;
    }
}
