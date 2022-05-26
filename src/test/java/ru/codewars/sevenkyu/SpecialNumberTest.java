package ru.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpecialNumberTest {

    @Test
    public void checkSingleDigitNumber() {
        assertEquals("Special!!", SpecialNumber.specialNumber(2));
        assertEquals("Special!!", SpecialNumber.specialNumber(3));
        assertEquals("NOT!!", SpecialNumber.specialNumber(9));
        assertEquals("NOT!!", SpecialNumber.specialNumber(7));
    }

    @Test
    public void twoDigitNumber() {
        assertEquals("Special!!", SpecialNumber.specialNumber(23));
        assertEquals("NOT!!", SpecialNumber.specialNumber(79));
        assertEquals("Special!!", SpecialNumber.specialNumber(32));
        assertEquals("NOT!!", SpecialNumber.specialNumber(39));
        assertEquals("Special!!", SpecialNumber.specialNumber(55));

    }

    @Test
    public void largerSpecialNumber() {
        assertEquals("Special!!", SpecialNumber.specialNumber(513));
        assertEquals("NOT!!", SpecialNumber.specialNumber(709));
        assertEquals("NOT!!", SpecialNumber.specialNumber(538));

    }

    @Test
    public void megaSepcialNumber() {
        assertEquals("Special!!", SpecialNumber.specialNumber(53532));
        assertEquals("NOT!!", SpecialNumber.specialNumber(970569));
        assertEquals("Special!!", SpecialNumber.specialNumber(11350224));
    }
}