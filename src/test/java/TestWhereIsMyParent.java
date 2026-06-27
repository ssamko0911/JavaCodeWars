import org.junit.jupiter.api.Test;
import task126.WhereIsMyParent;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWhereIsMyParent {
    @Test
    public void testEmptyString() {
        assertEquals("", WhereIsMyParent.findChildren(""));
    }

    @Test
    public void testCaseTwoFamilies() {
        assertEquals("AaBb", WhereIsMyParent.findChildren("abBA"));
    }

    @Test
    public void testTwoNonConsecutiveFamilies() {
        assertEquals("AaaaaaZzzz", WhereIsMyParent.findChildren("AaaaaZazzz"));
    }

    @Test
    public void testThreeFamilies() {
        assertEquals("AaBbbCcc", WhereIsMyParent.findChildren("CbcBcbaA"));
    }

    @Test
    public void testThreeNonConsecutiveFamilies() {
        assertEquals("FfUuuuXx", WhereIsMyParent.findChildren("xXfuUuuF"));
    }
}
