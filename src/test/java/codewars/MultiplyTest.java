package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Multiply;
import org.junit.Test;

public class MultiplyTest {
    @Test
    public void sampleTest() {
        Assert.assertEquals(4, Multiply.multiply(2, 2));
        Assert.assertEquals(10, Multiply.multiply(5, 2));
        Assert.assertEquals(100, Multiply.multiply(100, 1));
        Assert.assertEquals(0, Multiply.multiply(0, 1000));
    }

}