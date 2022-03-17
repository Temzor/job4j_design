package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.CodeWarsMath;
import org.junit.Test;

public class CodeWarsMathTest {
    @Test
    public void basicTests() {
        Assert.assertEquals(1, CodeWarsMath.nearestSq(1));
        Assert.assertEquals(1, CodeWarsMath.nearestSq(2));
        Assert.assertEquals(9, CodeWarsMath.nearestSq(10));
        Assert.assertEquals(121, CodeWarsMath.nearestSq(111));
        Assert.assertEquals(10000, CodeWarsMath.nearestSq(9999));
    }

}