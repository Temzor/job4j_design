package codewars;

import codewars.Sleigh;
import org.junit.Test;

import static org.junit.Assert.*;

public class SleighTest {
    @Test
    public void testAuthentication() {
        assertEquals(true, Sleigh.authenticate("Santa Claus", "Ho Ho Ho!"));
        assertEquals(false, Sleigh.authenticate("Santa", "Ho Ho Ho!"));
        assertEquals(false, Sleigh.authenticate("Santa Claus", "Ho Ho Ho"));
    }

}