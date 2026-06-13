package task124;

// https://www.codewars.com/kata/57a1d5ef7cb1f3db590002af/train/java

public class Fibonacci {
    public static long fib (int n){
        long elementPosition = 1;

        long previousEl = 0;
        long currentEl = 1;
        long nextEl;

        while(elementPosition != n){
            nextEl = currentEl + previousEl;
            elementPosition++;
            previousEl = currentEl;
            currentEl = nextEl;
        }

        return currentEl;
    }
}

/**
 * Recursive!
 *
 * public class Fibonacci {
 * 	public static long fib (int n) {
 *     if (n <= 1) {
 *       return n;
 *     }
 * 		return fib(n - 1) + fib(n -2);
 * 	    }
 * }
 */
