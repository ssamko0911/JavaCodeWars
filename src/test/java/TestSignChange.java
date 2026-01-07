import org.junit.jupiter.api.Test;
import task091.Solution;

import static org.junit.jupiter.api.Assertions.*;

public class TestSignChange {
    @Test
    public void TestNoSignChanges() {
        int expectedSignChangeCount = 0;
        assertEquals(expectedSignChangeCount, Solution.signChange(new int[]{1, 3, 4, 5}));
    }

    @Test
    public void TestEmptyArray() {
        int expectedSignChangeCount = 0;
        assertEquals(expectedSignChangeCount, Solution.signChange(new int[]{}));
    }

    @Test
    public void TestOneTwoChanges() {
        int expectedSignChangeCount = 2;
        assertEquals(expectedSignChangeCount, Solution.signChange(new int[]{1, -3, -4, 0, 5}));
    }
}
