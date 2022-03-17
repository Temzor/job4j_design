package codewars;

import ru.codewars.eightkyu.IsDivisible2;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsDivisible2Test {
    @Test
    public void fixedTests() {
        assertTrue(IsDivisible2.isDivisible(4050, 27));
        assertTrue(IsDivisible2.isDivisible(10000, 20));
        assertTrue(IsDivisible2.isDivisible(10005, 1));
        assertFalse(IsDivisible2.isDivisible(4066, 27));
        assertFalse(IsDivisible2.isDivisible(10005, 2));
    }

}