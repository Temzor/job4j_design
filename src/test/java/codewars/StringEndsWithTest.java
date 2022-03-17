package codewars;

import ru.codewars.eightkyu.StringEndsWith;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringEndsWithTest {
    @Test
    public void testSomething() {
        assertTrue(StringEndsWith.solution("samurai", "ai"));
        assertTrue(StringEndsWith.solution("abc", "bc"));
        assertFalse(StringEndsWith.solution("abc", "d"));
        assertFalse(StringEndsWith.solution("sumo", "omo"));
    }

}