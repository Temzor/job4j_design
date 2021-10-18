package codewars;

import codewars.MakeUpperCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class MakeUpperCaseTest {
    @Test
    public void testSomething() {
        assertEquals("HELLO", MakeUpperCase.makeUpperCase("hello"));
    }

}