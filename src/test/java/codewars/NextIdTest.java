package codewars;

import codewars.NextId;
import org.junit.Test;

import static org.junit.Assert.*;

public class NextIdTest {
    @Test
    public void fixedTests() {
        assertEquals(4, NextId.nextId(new int[] {0, 1, 2, 3, 5 }));
        assertEquals(4, NextId.nextId(new int[] {1, 2, 0, 2, 3 }));
        assertEquals(4, NextId.nextId(new int[] {1, 2, 0, 2, 3, 5 }));
        assertEquals(11, NextId.nextId(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
        assertEquals(0, NextId.nextId(new int[] {}));
    }

}