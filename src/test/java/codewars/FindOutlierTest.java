package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.FindOutlier;
import org.junit.Test;

public class FindOutlierTest {
    @Test
    public void testExample() {
        int[] exampleTest1 = {2, 6, 8, -10, 3};
        int[] exampleTest2 = {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        Assert.assertEquals(3, FindOutlier.find(exampleTest1));
        Assert.assertEquals(206847684, FindOutlier.find(exampleTest2));
        Assert.assertEquals(0, FindOutlier.find(exampleTest3));
    }

}