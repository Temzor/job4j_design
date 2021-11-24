package codewars;

import codewars.DigPow;
import org.junit.Test;

import static org.junit.Assert.*;

public class DigPowTest {
    @Test
    public void test1() {
        assertEquals(1, DigPow.digPow(89, 1));
    }
    @Test
    public void test2() {
        assertEquals(-1, DigPow.digPow(92, 1));
    }
    @Test
    public void test3() {
        assertEquals(51, DigPow.digPow(46288, 3));
    }

}