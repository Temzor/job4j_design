package codewars;

import codewars.AddLetters;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddLettersTest {
    @Test
    public void fixedTests() {
        assertEquals("f", AddLetters.addLetters("a", "b", "c"));
        assertEquals("z", AddLetters.addLetters("z"));
        assertEquals("c", AddLetters.addLetters("a", "b"));
        assertEquals("c", AddLetters.addLetters("c"));
        assertEquals("a", AddLetters.addLetters("z", "a"));
        assertEquals("d", AddLetters.addLetters("y", "c", "b"));
        assertEquals("z", AddLetters.addLetters());
    }

}