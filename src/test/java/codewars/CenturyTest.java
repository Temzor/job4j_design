package codewars;

import codewars.Century;
import org.junit.Test;

import static org.junit.Assert.*;

public class CenturyTest {

    @Test
    public void fixedTests() {
        assertEquals(18, Century.century(1705));
        assertEquals(19, Century.century(1900));
        assertEquals(17, Century.century(1601));
        assertEquals(20, Century.century(2000));
        assertEquals(1,  Century.century(89));
    }
}
