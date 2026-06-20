import org.junit.jupiter.api.Test;
import task062.Pentanacci;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPentanacci {

    @Test
    public void testBasicCase() {
        long expectedResult = 23;
        assertEquals(expectedResult, Pentanacci.countOddPentaFib(68));
    }
}
