import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Test;
import task087.Solution;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOrderedCount {
    @Test
    public void testLowercaseString() {
        List<Pair<Character, Integer>> expected = List.of(Pair.of('a', 5), Pair.of('b', 2), Pair.of('r', 2), Pair.of('c', 1), Pair.of('d', 1));
        assertEquals(expected, Solution.orderedCount("abracadabra"));
    }

    @Test
    public void testMixedString() {
        List<Pair<Character, Integer>> expected = List.of(Pair.of('C', 1), Pair.of('o', 1), Pair.of('d', 1), Pair.of('e', 1), Pair.of(' ', 1), Pair.of('W', 1), Pair.of('a', 1), Pair.of('r', 1), Pair.of('s', 1));
        assertEquals(expected, Solution.orderedCount("Code Wars"));
    }
}
