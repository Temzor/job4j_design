package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class SequenceSumTest {
    @Test
    public void testBasic() {
        assertEquals("0+1+2+3+4+5+6 = 21", SequenceSum.showSequence(6));
        assertEquals("-1<0", SequenceSum.showSequence(-1));
        assertEquals("0=0", SequenceSum.showSequence(0));
    }

}