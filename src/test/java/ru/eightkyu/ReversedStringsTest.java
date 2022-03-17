package ru.eightkyu;

import org.junit.Test;
import ru.codewars.eightkyu.ReversedStrings;

import static org.junit.Assert.assertEquals;

class ReversedStringsTest {
    @Test
    public void sampleTests() {
        assertEquals("dlrow", ReversedStrings.reversedStrings("world"));
    }

}