package codewars;

import ru.codewars.eightkyu.StringUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void fixedTests() {
        assertFalse(StringUtils.isDigit(""));
        assertTrue(StringUtils.isDigit("7"));
        assertFalse(StringUtils.isDigit(" "));
        assertFalse(StringUtils.isDigit("a"));
        assertFalse(StringUtils.isDigit("a5"));
        assertFalse(StringUtils.isDigit("14"));
    }

}