import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import task099.TimeConverter;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTimeConverter {
    private static Stream<Arguments> inputAndResults() {
        return Stream.of(
                Arguments.of(3600, "1 hour(s) and 0 minute(s)"),
                Arguments.of(3500, "0 hour(s) and 58 minute(s)"),
                Arguments.of(0, "0 hour(s) and 0 minute(s)")

        );
    }

    @ParameterizedTest
    @MethodSource("inputAndResults")
    public void testInputAndResults(int seconds, String expectedResult) {
        assertEquals(expectedResult, TimeConverter.toTime(seconds));
    }
}
