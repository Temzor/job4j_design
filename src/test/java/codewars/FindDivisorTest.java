package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.FindDivisor;
import org.junit.Test;

public class FindDivisorTest {
    FindDivisor fd = new FindDivisor();

    @Test
    public void fourTest() {
        Assert.assertEquals("Sould return 3 if the parameter equals 4", 3, fd.numberOfDivisors(4));
    }

    @Test
    public void fiveTest() {
        Assert.assertEquals("Sould return 2 if the parameter equals 5", 2, fd.numberOfDivisors(5));
    }

    @Test
    public void twelveTest() {
        Assert.assertEquals("Sould return 6 if the parameter equals 12", 6, fd.numberOfDivisors(12));
    }

    @Test
    public void thirtyTest() {
        Assert.assertEquals("Sould return 8 if the parameter equals 30", 8, fd.numberOfDivisors(30));
    }

}