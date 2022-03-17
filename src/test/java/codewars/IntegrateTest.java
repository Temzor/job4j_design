package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Integrate;
import org.junit.Test;

public class IntegrateTest {
    @Test
    public void exampleTests() {
        Assert.assertEquals("1x^3", Integrate.integrate(3, 2));
        Assert.assertEquals("2x^6", Integrate.integrate(12, 5));
        Assert.assertEquals("10x^2", Integrate.integrate(20, 1));
        Assert.assertEquals("10x^4", Integrate.integrate(40, 3));
        Assert.assertEquals("30x^3", Integrate.integrate(90, 2));
    }

}