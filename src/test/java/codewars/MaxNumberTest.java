package codewars;

import codewars.MaxNumber;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxNumberTest {
    @Test
    public void passBasicTests() {
        assertEquals(321, MaxNumber.maxNumber(213));
        assertEquals(9873, MaxNumber.maxNumber(7389));
        assertEquals(97632, MaxNumber.maxNumber(63792));
    }
    @Test
    public void passDigitOccurrenceRepeation() {
        assertEquals(977665, MaxNumber.maxNumber(566797));
        assertEquals(9987332, MaxNumber.maxNumber(2399783));
        assertEquals(99997777, MaxNumber.maxNumber(79797979));
    }
    @Test
    public void passLargeNumbers() {
        assertEquals(98764321, MaxNumber.maxNumber(17693284));
        assertEquals(98776531, MaxNumber.maxNumber(17758936));
        assertEquals(987665431, MaxNumber.maxNumber(134976658));
    }

}