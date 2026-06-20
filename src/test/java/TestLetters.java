import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import task121.Letters;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLetters {
    public static Stream<Arguments> inputAndResultsRandom() {
        return Stream.of(
                Arguments.of("a **&  bZ", "11000000000000000000000001"),
                Arguments.of("!!a$%&RgTT", "10000010000000000101000000"),
                Arguments.of("&%&%/$%$%$%$%GYtf67fg34678hgfdyd", "00010111000000000001000010")
        );
    }

    @Test
    @DisplayName("Basic test, non repeating characters")
    public void testBasicCase() {
        assertEquals(
                "11111000000000000000000001",
                Letters.search("abcdez")
        );
    }

    @Test
    @DisplayName("Basic test, one repeating char")
    public void testBasicRepeatedCharCase() {
        assertEquals(
                "10000000000000000000000000",
                Letters.search("aaaaa")
        );
    }

    @Test
    @DisplayName("Full abc")
    public void testFullAlphabetCase() {
        assertEquals(
                "11111111111111111111111111",
                Letters.search("abcdefghijklmnopqrstuvwxyz")
        );
    }

    @Test
    @DisplayName("All zeroes on empty string")
    public void testEmptyAlphabetCase() {
        assertEquals(
                "00000000000000000000000000",
                Letters.search("")
        );
    }

    @Test
    @DisplayName("All zeroes on non letters")
    public void testNotLettersCase() {
        assertEquals(
                "00000000000000000000000000",
                Letters.search("!&*$%^)__")
        );
    }

    @ParameterizedTest
    @MethodSource("inputAndResultsRandom")
    public void testRandomStrings(String input, String expected) {
        assertEquals(expected, Letters.search(input));
    }
}
