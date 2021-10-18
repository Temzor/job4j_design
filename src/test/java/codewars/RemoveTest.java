package codewars;

import codewars.Remove;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveTest {
    @Test
    public void fixedTests() {
        assertEquals("Hi", Remove.remove("Hi!", 1));
        assertEquals("Hi", Remove.remove("Hi!", 100));
        assertEquals("Hi!!", Remove.remove("Hi!!!", 1));
        assertEquals("Hi", Remove.remove("Hi!!!", 100));
        assertEquals("Hi", Remove.remove("!Hi", 1));
        assertEquals("Hi!", Remove.remove("!Hi!", 1));
        assertEquals("Hi", Remove.remove("!Hi!", 100));
        assertEquals("!!Hi !!hi!!! !hi", Remove.remove("!!!Hi !!hi!!! !hi", 1));
        assertEquals("Hi !!hi!!! !hi", Remove.remove("!!!Hi !!hi!!! !hi", 3));
        assertEquals("Hi hi!!! !hi", Remove.remove("!!!Hi !!hi!!! !hi", 5));
        assertEquals("Hi hi hi", Remove.remove("!!!Hi !!hi!!! !hi", 100));
    }

}