package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.SumTriangularNumbers;
import org.junit.Test;

public class SumTriangularNumbersTest {
    @Test
    public void basicTests() {
        Assert.assertEquals(56, SumTriangularNumbers.sumTriangularNumbers(6));
        Assert.assertEquals(7140, SumTriangularNumbers.sumTriangularNumbers(34));
        Assert.assertEquals(0, SumTriangularNumbers.sumTriangularNumbers(-291));
        Assert.assertEquals(140205240, SumTriangularNumbers.sumTriangularNumbers(943));
        Assert.assertEquals(0, SumTriangularNumbers.sumTriangularNumbers(-971));
    }

}