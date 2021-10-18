package codewars;

import codewars.Compute;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComputeTest {
    @Test
    public void testGcd() {
        assertEquals(6, Compute.compute(30, 12));
        assertEquals(1, Compute.compute(8, 9));
        assertEquals(1, Compute.compute(1, 1));
    }

}