import org.junit.jupiter.api.Test;
import task092.SequenceSum;

import static org.junit.jupiter.api.Assertions.*;

public class TestSequenceSum {
    @Test
    public void testPositiveArgument() {
        int[] expected = new int[]{0, 1, 3, 6};
        assertArrayEquals(expected, SequenceSum.sumOfN(3));
    }

    @Test
    public void testNegativeArgument() {
        int[] expected = new int[]{0, -1, -3, -6, -10};
        assertArrayEquals(expected, SequenceSum.sumOfN(-4));
    }

    @Test
    public void testZeroArgument() {
        int[] expected = new int[]{0};
        assertArrayEquals(expected, SequenceSum.sumOfN(0));
    }

    @Test
    public void testOneArgument() {
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, SequenceSum.sumOfN(1));
    }
}
