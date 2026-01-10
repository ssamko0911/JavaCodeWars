import org.junit.jupiter.api.Test;
import task093.Solution;

import static org.junit.jupiter.api.Assertions.*;

public class TestMaxMinArrays {
    @Test
    public void TestBasicArrayExample() {
        int[] expected = new int[]{15, 7, 12, 10, 11};
        assertArrayEquals(expected, Solution.solve(new int[]{15, 11, 10, 7, 12}));
    }
}
