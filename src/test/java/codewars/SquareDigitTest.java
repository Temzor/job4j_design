package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.SquareDigit;
import org.junit.Test;

public class SquareDigitTest {
    @Test
    public void test() {
        Assert.assertEquals(811181, new SquareDigit().squareDigits(9119));
        Assert.assertEquals(0, new SquareDigit().squareDigits(0));
    }

}