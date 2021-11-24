package codewars;

import codewars.Feast;
import org.junit.Test;

import static org.junit.Assert.*;

public class FeastTest {
    @Test
    public void fixedTest() {
        assertTrue(Feast.feast("great blue heron", "garlic nann"));
        assertTrue(Feast.feast("chickadee", "chocolate cake"));
        assertFalse(Feast.feast("brown bear", "bear claw"));
    }

}