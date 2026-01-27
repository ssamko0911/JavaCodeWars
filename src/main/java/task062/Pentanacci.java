package task062;

//https://www.codewars.com/kata/55c9172ee4bb15af9000005d/train/java

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Pentanacci {
    public static long countOddPentaFib(long n) {
        if (n < 0) {
            return 0;
        }

        HashSet<Long> odds = new HashSet<>();

        long f0 = 0L, f1 = 1L, f2 = 1L, f3 = 2L, f4 = 4L;
        if (n >= 0 && f0 % 2 != 0) odds.add(f0);
        if (n >= 1 && f1 % 2 != 0) odds.add(f1);
        if (n >= 2 && f2 % 2 != 0) odds.add(f2);
        if (n >= 3 && f3 % 2 != 0) odds.add(f3);
        if (n >= 4 && f4 % 2 != 0) odds.add(f4);

        for (long i = 5; i <= n; i++) {
            long next = f0 + f1 + f2 + f3 + f4;

            if (next % 2 != 0) {
                odds.add(next);
            }

            f0 = f1;
            f1 = f2;
            f2 = f3;
            f3 = f4;
            f4 = next;
        }

        return odds.size();
    }
}

/*
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Pentanacci {
    public static long countOddPentaFib(long n) {
        if (n < 0) {
            return 0;
        }

        List<Long> sequence = new ArrayList<>();
        sequence.add(0L);
        sequence.add(1L);
        sequence.add(1L);
        sequence.add(2L);
        sequence.add(4L);

        HashSet<Long> odds = new HashSet<>();

        for (int i = 0; i <= Math.min(n, 4); i++) {
            if (sequence.get(i) % 2 == 1) {
                odds.add(sequence.get(i));
            }
        }

        for (int i = 5; i <= n; i++) {
            long pentabonacciNumber = sequence.get(i-1) + sequence.get(i-2) + sequence.get(i-3) + sequence.get(i-4) + sequence.get(i-5);
            sequence.add(pentabonacciNumber);

            if (pentabonacciNumber % 2 != 0) {
                odds.add(pentabonacciNumber);
            }
        }

        return odds.size();
    }
}

 */
