package codewars;

import codewars.AddFive;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddFiveTest {
    @Test
    public void testAddFive() {
        assertEquals(10, AddFive.addFive(5));
    }
    @Test
    public void testAddZero() {
        assertEquals(5, AddFive.addFive(0));
    }
    @Test
    public void testAddNegativeFive() {
        assertEquals(0, AddFive.addFive(-5));
    }
    @Test
    public void testRandom() {
        for (int i = 0; i < 50; i++) {
            int rand = (int) (Math.random() * 1000) + 1;
            assertEquals(rand + 5, AddFive.addFive(rand));
        }
    }
}