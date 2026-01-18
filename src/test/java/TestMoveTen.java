import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import task111.MoveTen;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMoveTen {
    private static Stream<Arguments> inputAndResults() {
        return Stream.of(
                Arguments.of("testcase", "docdmkco"),
                Arguments.of("codewars", "mynogkbc"),
                Arguments.of("exampletesthere", "ohkwzvodocdrobo")

        );
    }

    @ParameterizedTest
    @MethodSource("inputAndResults")
    public void TestMoveTen(String input, String expectedResult) {
        assertEquals(expectedResult, MoveTen.moveTen(input));
    }
}
