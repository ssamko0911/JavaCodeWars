import org.junit.jupiter.api.Test;
import task088.BackspacesInString;

import static org.junit.jupiter.api.Assertions.*;

public class TestBackspacesInString {
    @Test
    public void TestStringWithThreeBackspaces() {
        BackspacesInString bs = new BackspacesInString();
        String expectedStr = "ac";
        assertEquals(expectedStr, bs.cleanString("abc#d##c"));
    }

    @Test
    public void TestEmptyString() {
        BackspacesInString bs = new BackspacesInString();
        String expectedStr = "";
        assertEquals(expectedStr, bs.cleanString(""));
    }

    @Test
    public void TestReturnEmptyStringFromValidInput() {
        BackspacesInString bs = new BackspacesInString();
        String expectedStr = "";
        assertEquals(expectedStr, bs.cleanString("abc####d##c#"));
    }
}
