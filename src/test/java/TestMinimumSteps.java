import org.junit.jupiter.api.Test;
import task089.Kata;

import static org.junit.jupiter.api.Assertions.*;

public class TestMinimumSteps {
    @Test
    public void TestMinimumStepsWithOneStep() {
        int expectedMinimumSteps = 1;
        assertEquals(expectedMinimumSteps, Kata.minimumSteps(
                new int[]{4, 6, 3}, 7
        ));
    }

    @Test
    public void TestMinimumStepsWithNSteps() {
        int expectedMinimumSteps = 8;
        assertEquals(expectedMinimumSteps, Kata.minimumSteps(
                new int[]{19, 98, 69, 28, 75, 45, 17, 98, 67}, 464
        ));
    }

    @Test
    public void TestMinimumStepsWithManySteps() {
        int expectedMinimumSteps = 16;

        assertEquals(expectedMinimumSteps, Kata.minimumSteps(
                new int[]{1, 1, 4, 6, 6, 8, 10, 12, 12, 12, 12, 13, 13, 15, 16, 18, 18, 21, 21, 23, 25, 26, 26, 26, 26, 27, 28, 29, 30, 41, 41, 42, 43, 43, 43, 44, 47, 48, 49, 51, 52, 52, 53, 55, 56, 57, 57, 57, 57, 58, 59, 60, 61, 63, 64, 68, 69, 70, 70, 72, 72, 74, 74, 74, 75, 75, 76, 78, 78, 81, 82, 83, 84, 87, 88, 88, 90, 91, 91, 93, 93, 95, 95, 96, 96, 96, 100, 100, 101, 101, 102, 102, 102, 104, 104, 105, 107, 109, 109, 111, 114, 114, 118, 121, 122, 124, 125, 126, 127, 129, 130, 132, 132, 133, 134, 135, 135, 136, 140, 141, 142, 142, 144, 147, 147, 148, 151, 151, 151, 152, 155, 158, 158, 158, 158, 159, 161, 161, 166, 170, 170, 173, 173, 173, 175, 175, 177, 180, 180, 180, 181, 183, 183, 183, 186, 187, 189, 189, 189, 189, 189, 190, 191, 192, 192, 192, 193, 194, 195, 197, 199, 200}, 177
        ));
    }
}
