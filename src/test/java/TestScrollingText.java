import org.junit.jupiter.api.Test;
import task120.Kata;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestScrollingText {
    @Test
    public void testBasicCase() {
        String[] expectedResult = new String[]{
                "CODEWARS",
                "ODEWARSC",
                "DEWARSCO",
                "EWARSCOD",
                "WARSCODE",
                "ARSCODEW",
                "RSCODEWA",
                "SCODEWAR"
        };

        assertArrayEquals(expectedResult, Kata.scrollingText("codewars"));
    }

    @Test
    public void testBasicCaseSpecialChars() {
        String[] expectedResult = new String[]{
                "GOOD LUCK!",
                "OOD LUCK!G",
                "OD LUCK!GO",
                "D LUCK!GOO",
                " LUCK!GOOD",
                "LUCK!GOOD ",
                "UCK!GOOD L",
                "CK!GOOD LU",
                "K!GOOD LUC",
                "!GOOD LUCK"
        };

        assertArrayEquals(expectedResult, Kata.scrollingText("good luck!"));
    }
}
