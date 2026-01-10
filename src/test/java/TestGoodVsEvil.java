import org.junit.jupiter.api.Test;
import task090.GoodVsEvil;

import static org.junit.jupiter.api.Assertions.*;

public class TestGoodVsEvil {
    @Test
    public void testEvilWin() {
        String expectedResult = GoodVsEvil.EVIL_WIN;
        assertEquals(expectedResult, GoodVsEvil.battle("1 1 1 1 1 1", "1 1 1 1 1 1 1"));
    }

    @Test
    public void testGoodWin() {
        String expectedResult = GoodVsEvil.GOOD_WIN;
        assertEquals(expectedResult, GoodVsEvil.battle("0 0 0 0 0 10", "0 1 1 1 1 0 0"));
    }

    @Test
    public void testDraw() {
        String expectedResult = GoodVsEvil.DRAW;
        assertEquals(expectedResult, GoodVsEvil.battle("1 0 0 0 0 0", "1 0 0 0 0 0 0"));
    }

    @Test
    public void testGoodWinFromRandomTests() {
        String expectedResult = GoodVsEvil.GOOD_WIN;
        assertEquals(expectedResult, GoodVsEvil.battle("4849 905 2821 1510 4613 7458", "9928 1427 3510 3037 7453 1200 2940"));
    }
}
