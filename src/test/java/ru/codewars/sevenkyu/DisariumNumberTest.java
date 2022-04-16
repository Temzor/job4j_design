package ru.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class DisariumNumberTest {

    @Test
    public void disariumOrNot() {
        assertEquals("Disarium !!", DisariumNumber.disariumNumber(89));
        assertEquals("Not !!", DisariumNumber.disariumNumber(564));
        assertEquals("Not !!", DisariumNumber.disariumNumber(1024));
    }

    @Test
    public void largerNumbers() {
        assertEquals("Not !!", DisariumNumber.disariumNumber(64599));
        assertEquals("Not !!", DisariumNumber.disariumNumber(136586));
        assertEquals("Not !!", DisariumNumber.disariumNumber(1048576));
    }
}