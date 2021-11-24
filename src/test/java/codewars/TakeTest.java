package codewars;

import codewars.Take;
import org.junit.Test;

import static org.junit.Assert.*;

public class TakeTest {
    @Test
    public void basicTests() {
        assertArrayEquals("should return the first 3 items", new int[]{0, 1, 2}, Take.take(new int[]{0, 1, 2, 3, 5, 8, 13}, 3));
    }

}