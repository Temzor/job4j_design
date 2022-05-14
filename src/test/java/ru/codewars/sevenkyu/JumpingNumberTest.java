package ru.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JumpingNumberTest {
    @Test
    public void singleDigitNumber() {
        assertEquals("Jumping!!", JumpingNumber.jumpingNumber(9));
        assertEquals("Jumping!!", JumpingNumber.jumpingNumber(1));
        assertEquals("Jumping!!", JumpingNumber.jumpingNumber(7));
    }

    @Test
    public void twoDigitNumber() {
        assertEquals("Jumping!!", JumpingNumber.jumpingNumber(23));
        assertEquals("Jumping!!", JumpingNumber.jumpingNumber(32));
        assertEquals("Not!!", JumpingNumber.jumpingNumber(79));
        assertEquals("Jumping!!", JumpingNumber.jumpingNumber(98));
    }

    @Test
    public void largerNumbers() {
        assertEquals("Jumping!!", JumpingNumber.jumpingNumber(8987));
        assertEquals("Jumping!!", JumpingNumber.jumpingNumber(4343456));
        assertEquals("Jumping!!", JumpingNumber.jumpingNumber(98789876));
    }

}