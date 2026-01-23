import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import task114.Kata;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPattern {
    public static Stream<Arguments> inputsAndResultsBasic() {
        return Stream.of(
                Arguments.of(1, "1"),
                Arguments.of(2, "1\n1*2"),
                Arguments.of(3, "1\n1*2\n1**3")
        );
    }

    @ParameterizedTest
    @MethodSource("inputsAndResultsBasic")
    public void basicTest(int input, String expectedResult) {
        assertEquals(expectedResult, Kata.pattern(input));

    }
}
