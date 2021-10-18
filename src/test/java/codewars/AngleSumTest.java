package codewars;

import codewars.AngleSum;
import org.junit.Test;

import static org.junit.Assert.*;

public class AngleSumTest {
    @Test
    public void sampleTests() {
        assertEquals(180, AngleSum.sumOfAngles(3));
        assertEquals(360, AngleSum.sumOfAngles(4));
    }
}