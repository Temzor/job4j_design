package codewars;

import codewars.ReversedSequence;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversedSequenceTest {
    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ReversedSequence.reverse(5));
    }

}