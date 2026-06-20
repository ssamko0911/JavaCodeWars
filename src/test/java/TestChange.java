import org.junit.jupiter.api.Test;
import task125.Change;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestChange {
    @Test
    public void testBasicCase() {
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("Pennies", 4);
        expected.put("Nickels", 0);
        expected.put("Dimes", 0);
        expected.put("Quarters", 1);

        HashMap<String, Integer> actual = Change.looseChange(29);

        assertEquals(expected, actual);
    }

    @Test
    public void testExactlyOneCoinTypePenniesCase() {
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("Pennies", 4);
        expected.put("Nickels", 0);
        expected.put("Dimes", 0);
        expected.put("Quarters", 0);

        HashMap<String, Integer> actual = Change.looseChange(4);

        assertEquals(expected, actual);
    }

    @Test
    public void testExactlyOneCoinTypeNickelsCase() {
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("Pennies", 0);
        expected.put("Nickels", 1);
        expected.put("Dimes", 0);
        expected.put("Quarters", 0);

        HashMap<String, Integer> actual = Change.looseChange(5);

        assertEquals(expected, actual);
    }

    @Test
    public void testExactlyOneCoinTypeDimesCase() {
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("Pennies", 0);
        expected.put("Nickels", 0);
        expected.put("Dimes", 1);
        expected.put("Quarters", 0);

        HashMap<String, Integer> actual = Change.looseChange(10);

        assertEquals(expected, actual);
    }

    @Test
    public void testExactlyOneCoinTypeQuartersCase() {
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("Pennies", 0);
        expected.put("Nickels", 0);
        expected.put("Dimes", 0);
        expected.put("Quarters", 2);

        HashMap<String, Integer> actual = Change.looseChange(50);

        assertEquals(expected, actual);
    }

    @Test
    public void testZeroCoinsChange() {
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("Pennies", 0);
        expected.put("Nickels", 0);
        expected.put("Dimes", 0);
        expected.put("Quarters", 0);

        HashMap<String, Integer> actual = Change.looseChange(0);

        assertEquals(expected, actual);
    }

    @Test
    public void testNegativeValueForCoinsChange() {
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("Pennies", 0);
        expected.put("Nickels", 0);
        expected.put("Dimes", 0);
        expected.put("Quarters", 0);

        HashMap<String, Integer> actual = Change.looseChange(-2);

        assertEquals(expected, actual);
    }
}
