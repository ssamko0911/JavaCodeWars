package task062;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Pentanacci {
    public static long countOddPentaFib(long n) {
        if (0 == n) {
            return 0;
        }

        if (1 == n || 2 == n || 5 == n) {
            return 1;
        }

        List <Long> sequence = new ArrayList<>();
        sequence.add(0L);
        sequence.add(1L);
        sequence.add(2L);
        sequence.add(3L);
        sequence.add(4L);

        List <Long> odds = new ArrayList<>();
        odds.add(1L);

        for (int i = 5; i <= n; i++) {
            long pentanacciNumber = sequence.get(i - 1) + sequence.get(i - 2) + sequence.get(i - 3) + sequence.get(i - 4) + sequence.get(i - 5);
            sequence.add(pentanacciNumber);

            if (1 == pentanacciNumber % 2) {
                odds.add(pentanacciNumber);
            }
        }

        return  odds.size();
    }
}
