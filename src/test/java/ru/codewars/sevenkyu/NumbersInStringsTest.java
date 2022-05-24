package ru.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumbersInStringsTest {
    @Test
    public void basicTests() {
        assertEquals(9, NumbersInStrings.numbersInStrings("2ti9iei7qhr5"));
        assertEquals(695, NumbersInStrings.numbersInStrings("gh12cdy695m1"));
        assertEquals(85, NumbersInStrings.numbersInStrings("lu1j8qbbb85"));
        assertEquals(185, NumbersInStrings.numbersInStrings("185lu1j8qbbb85"));
    }
}