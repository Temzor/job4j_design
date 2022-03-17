package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.AngleSum;
import org.junit.Test;

public class AngleSumTest {
    @Test
    public void sampleTests() {
        Assert.assertEquals(180, AngleSum.sumOfAngles(3));
        Assert.assertEquals(360, AngleSum.sumOfAngles(4));
    }
}