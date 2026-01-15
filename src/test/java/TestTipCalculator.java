import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import task100.TipCalculator;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestTipCalculator {
    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of(30.0, "poor", 2),
                Arguments.of(20.0, "Excellent", 4),
                Arguments.of(107.65, "GReat", 17)
        );
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    public void testTipCalculator(double amount, String rating, int expectedTip) {
        assertEquals(expectedTip, TipCalculator.calculateTip(amount, rating));
    }

    @Test
    public void testTipCalculatorWrongInput() {
        assertNull(TipCalculator.calculateTip(20.0, "hi"));
    }
}
