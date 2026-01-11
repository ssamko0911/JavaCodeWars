import org.junit.jupiter.api.Test;
import task095.Kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEvenOrOdd {
    @Test
    public void testEvenWins() {
        String expected = "Even is greater than Odd";
        assertEquals(expected, Kata.evenOrOdd("12"));
    }

    @Test
    public void testOddWins() {
        String expected = "Odd is greater than Even";
        assertEquals(expected, Kata.evenOrOdd("123"));
    }

    @Test
    public void testEqualSums() {
        String expected = "Even and Odd are the same";
        assertEquals(expected, Kata.evenOrOdd("112"));
    }
}
