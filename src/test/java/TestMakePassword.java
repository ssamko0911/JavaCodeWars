import org.junit.jupiter.api.Test;
import task123.Kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMakePassword {
    @Test
    public void testBasicCase() {
        assertEquals("Gml0gmd", Kata.makePassword("Give me liberty or give me death"));
    }

    @Test
    public void testUntrimmedInput() {
        assertEquals("Gml0gmd", Kata.makePassword("       Give me liberty or give me death     "));
    }

    @Test
    public void testLastWordSubstitution() {
        assertEquals("Gml0gm1", Kata.makePassword("Give me liberty or give me immortality"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", Kata.makePassword(""));
    }

    @Test
    public void testUppercase() {
        assertEquals("KCaC0", Kata.makePassword("Keep Calm and Carry On"));
    }
}
