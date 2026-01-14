
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;
import task102.Solution;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestTimeCorrect {
    public static Stream<Arguments> inputsAndResultsBasic() {
        return Stream.of(
                Arguments.of("09:10:01", "09:10:01"),
                Arguments.of("00:00:00", "00:00:00"),
                Arguments.of("23:59:59", "23:59:59"),
                Arguments.of("12:34:56", "12:34:56")
        );
    }

    public static Stream<Arguments> inputsAndResultsRequireCorrection() {
        return Stream.of(
                Arguments.of("11:70:10", "12:10:10"),
                Arguments.of("19:99:09", "20:39:09"),
                Arguments.of("19:99:99", "20:40:39"),
                Arguments.of("24:01:01", "00:01:01"),
                Arguments.of("52:01:01", "04:01:01")
        );
    }

    public static Stream<Arguments> inputsAndResultsEdgeCases() {
        return Stream.of(
                Arguments.of("24:00:00", "00:00:00"),
                Arguments.of("23:59:60", "00:00:00")
        );
    }

    @ParameterizedTest
    @MethodSource("inputsAndResultsBasic")
    public void testTimeNoCorrectionNeeded(String inputTime, String expectedTime) {
        assertEquals(expectedTime, Solution.timeCorrect(inputTime));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResultsRequireCorrection")
    public void testTimeCorrectionNeeded(String inputTime, String expectedTime) {
        assertEquals(expectedTime, Solution.timeCorrect(inputTime));
    }

    @ParameterizedTest
    @NullSource
    public void testTimeCorrectionOnNull(String inputTime) {
        assertNull(Solution.timeCorrect(inputTime));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResultsEdgeCases")
    public void testTimeCorrectionEdgeCases(String inputTime, String expectedTime) {
        assertEquals(expectedTime, Solution.timeCorrect(inputTime));
    }
}
