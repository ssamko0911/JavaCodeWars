import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import task124.Fibonacci;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFibonacci {
    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(3, 2),
                Arguments.of(4, 3),
                Arguments.of(5, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    public void testBasicCase(int input, long expected) {
        assertEquals(expected, Fibonacci.fib(input));
    }
}
