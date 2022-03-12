package ru.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class DoubleCharTest {

    @Test
    public void thenOneString() {
        DoubleChar doubleChar = new DoubleChar();
        assertEquals("SSttrriinngg", doubleChar.doubleChar("String"));
        assertEquals("HHeelllloo  WWoorrlldd", doubleChar.doubleChar("Hello World"));
        assertEquals("11223344!!__  ", doubleChar.doubleChar("1234!_ "));
    }

}