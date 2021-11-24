package codewars;

import codewars.ReplaceDots;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceDotsTest {
    @Test
    public void testSomeDots() {
        assertEquals("Sorry, try again :-(", "one-two-three", ReplaceDots.replaceDots("one.two.three"));
    }

}