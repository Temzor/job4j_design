package codewars;

import codewars.Dubstep;
import org.junit.Test;

import static org.junit.Assert.*;

public class DubstepTest {
    @Test
    public void test1() {
        assertEquals("ABC", Dubstep.songDecoder("WUBWUBABCWUB"));
    }
    @Test
    public void test2() {
        assertEquals("R L", Dubstep.songDecoder("RWUBWUBWUBLWUB"));
    }

}