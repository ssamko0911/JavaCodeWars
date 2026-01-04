package task069;

//https://www.codewars.com/kata/55caf1fd8063ddfa8e000018/train/java

import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Progression {
    public static String arithmeticSequenceElements(int firstElement, int difference, long numberElements) {
        long[] progression = new long[(int)numberElements];
        progression[0] = firstElement;

        for (int i = 1; i < numberElements; i++) {
            progression[i] = progression[i - 1] + difference;
        }

        return LongStream.of(progression)
                .mapToObj(Long::toString)
                .collect(Collectors.joining(", "));
    }
}
