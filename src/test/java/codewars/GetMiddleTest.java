package codewars;

import codewars.GetMiddle;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetMiddleTest {
    @Test
    public void evenTests() {
        assertEquals("es", GetMiddle.getMiddle("test"));
        assertEquals("dd", GetMiddle.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", GetMiddle.getMiddle("testing"));
        assertEquals("A", GetMiddle.getMiddle("A"));
    }

}