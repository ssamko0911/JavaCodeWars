package task011;

//https://www.codewars.com/kata/534d0a229345375d520006a0/train/java
public class PowerOfTwo {
    public static boolean isPowerOfTwo(long n) {
        double power = 0;
        double values = 0;

        while (values <= n) {
            values = Math.pow(2, power);

            if (values == n) {
                return true;
            }

            power++;
        }

        return false;
    }
}
