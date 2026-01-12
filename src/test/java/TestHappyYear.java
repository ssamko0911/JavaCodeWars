import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import task097.HappyYear;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHappyYear {

    private static Stream<Arguments> inputsAndResultsBasic() {
        return Stream.of(
                Arguments.of(1001, 1023),
                Arguments.of(1123, 1203),
                Arguments.of(2001, 2013),
                Arguments.of(2334, 2340),
                Arguments.of(3331, 3401),
                Arguments.of(2342, 2345),
                Arguments.of(1987, 2013),
                Arguments.of(2013, 2014),
                Arguments.of(3000, 3012)
        );
    }

    private static Stream<Arguments> inputsAndResultsLarger() {
        return Stream.of(
                Arguments.of(5555, 5601),
                Arguments.of(7712, 7801),
                Arguments.of(8088, 8091),
                Arguments.of(8800, 8901),
                Arguments.of(8989, 9012),
                Arguments.of(8977, 9012),
                Arguments.of(6869, 6870),
                Arguments.of(8999, 9012)
        );
    }

    @ParameterizedTest
    @MethodSource("inputsAndResultsBasic")
    public void testHappyYearBasicValues(int inputYear, int expectedYear) {
        assertEquals(expectedYear, HappyYear.nextHappyYear(inputYear));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResultsLarger")
    public void testHappyYearLargerValue(int inputYear, int expectedYear) {
        assertEquals(expectedYear, HappyYear.nextHappyYear(inputYear));
    }
}
