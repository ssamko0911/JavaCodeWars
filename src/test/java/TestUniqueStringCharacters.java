import org.junit.jupiter.api.Test;
import task094.Solution;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUniqueStringCharacters {
    @Test
    public void testUniqueStringCharacters() {
        String expected = "ybzc";
        assertEquals(expected, Solution.solve("xyab","xzca"));
    }
}
