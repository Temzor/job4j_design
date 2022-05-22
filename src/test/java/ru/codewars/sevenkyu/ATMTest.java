package ru.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class ATMTest {
    @Test
    public void testATM() {
        assertEquals(4, new ATM().atm(770));
        assertEquals(-1, new ATM().atm(125));
        assertEquals(2, new ATM().atm(550));
        assertEquals(1, new ATM().atm(10));
        assertEquals(-1, new ATM().atm(238));
    }

}