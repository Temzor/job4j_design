package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.MaxNumber;
import org.junit.Test;

public class MaxNumberTest {
    @Test
    public void passBasicTests() {
        Assert.assertEquals(321, MaxNumber.maxNumber(213));
        Assert.assertEquals(9873, MaxNumber.maxNumber(7389));
        Assert.assertEquals(97632, MaxNumber.maxNumber(63792));
    }
    @Test
    public void passDigitOccurrenceRepeation() {
        Assert.assertEquals(977665, MaxNumber.maxNumber(566797));
        Assert.assertEquals(9987332, MaxNumber.maxNumber(2399783));
        Assert.assertEquals(99997777, MaxNumber.maxNumber(79797979));
    }
    @Test
    public void passLargeNumbers() {
        Assert.assertEquals(98764321, MaxNumber.maxNumber(17693284));
        Assert.assertEquals(98776531, MaxNumber.maxNumber(17758936));
        Assert.assertEquals(987665431, MaxNumber.maxNumber(134976658));
    }

}