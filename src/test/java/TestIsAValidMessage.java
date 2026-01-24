import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import task063.Kata;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestIsAValidMessage {
    private static Stream<Arguments> inputsAndResultsBasicTrue() {
        return Stream.of(
                Arguments.of("3hey5hello2hi"),
                Arguments.of("4code13hellocodewars"),
                Arguments.of("0")
        );
    }

    private static Stream<Arguments> inputsAndResultsBasicFalse() {
        return Stream.of(
                Arguments.of("3hey5hello2hi11"),
                Arguments.of("3hey5hello4hi")
        );
    }

    @ParameterizedTest
    @MethodSource("inputsAndResultsBasicTrue")
    public void testBasicTrue(String input) {
        assertTrue(Kata.isAValidMessage(input));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResultsBasicFalse")
    public void testBasicFalse(String input) {
        assertFalse(Kata.isAValidMessage(input));
    }
}
