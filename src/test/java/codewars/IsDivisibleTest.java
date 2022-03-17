package codewars;

import ru.codewars.eightkyu.IsDivisible;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsDivisibleTest {
    @Test
    public void test1() {
        assertTrue(IsDivisible.isDivisible(12, 4, 3));
    }
    @Test
    public void test2() {
        assertFalse(IsDivisible.isDivisible(3, 3, 4));
    }

}