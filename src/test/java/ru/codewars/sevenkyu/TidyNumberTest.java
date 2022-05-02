package ru.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class TidyNumberTest {
    @Test
    public void checkSmallValues() {
        assertTrue(TidyNumber.tidyNumber(12));
        assertFalse(TidyNumber.tidyNumber(32));
        assertTrue(TidyNumber.tidyNumber(39));
    }
    @Test
    public void checkLargerValues() {
        assertFalse(TidyNumber.tidyNumber(1024));
        assertFalse(TidyNumber.tidyNumber(12576));
        assertTrue(TidyNumber.tidyNumber(13579));
        assertTrue(TidyNumber.tidyNumber(2335));
    }
}