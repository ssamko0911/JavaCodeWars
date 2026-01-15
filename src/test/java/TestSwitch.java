import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import task103.Switch;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSwitch {
    private static Stream<Arguments> inputAndResults() {
        return Stream.of(
                Arguments.of("bac", "abc"),
                Arguments.of("ccc", "ccc"),
                Arguments.of("bbbacccabbb", "aaabcccbaaa")

        );
    }

    @ParameterizedTest
    @MethodSource("inputAndResults")
    public void testBasicCases(String input, String expectedResult) {
        assertEquals(expectedResult, Switch.switcheroo(input));
    }
}
