package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.QuarterOf;
import org.junit.Test;

public class QuarterOfTest {
    @Test
    public void exampleTests() {
        Assert.assertEquals(1, QuarterOf.quarterOf(3));
        Assert.assertEquals(3, QuarterOf.quarterOf(8));
        Assert.assertEquals(4, QuarterOf.quarterOf(11));
    }

}