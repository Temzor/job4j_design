package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.ExpressionsMatter;
import org.junit.Test;

public class ExpressionsMatterTest {
    @Test
    public void checkSmallValues() {
        Assert.assertEquals(6, ExpressionsMatter.expressionsMatter(2, 1, 2));
        Assert.assertEquals(3, ExpressionsMatter.expressionsMatter(1, 1, 1));
        Assert.assertEquals(4, ExpressionsMatter.expressionsMatter(2, 1, 1));
        Assert.assertEquals(9, ExpressionsMatter.expressionsMatter(1, 2, 3));
        Assert.assertEquals(5, ExpressionsMatter.expressionsMatter(1, 3, 1));
        Assert.assertEquals(8, ExpressionsMatter.expressionsMatter(2, 2, 2));
    }

    @Test
    public void checkIntermediateValues() {
        Assert.assertEquals(20, ExpressionsMatter.expressionsMatter(5, 1, 3));
        Assert.assertEquals(105, ExpressionsMatter.expressionsMatter(3, 5, 7));
        Assert.assertEquals(35, ExpressionsMatter.expressionsMatter(5, 6, 1));
        Assert.assertEquals(8, ExpressionsMatter.expressionsMatter(1, 6, 1));
        Assert.assertEquals(14, ExpressionsMatter.expressionsMatter(2, 6, 1));
        Assert.assertEquals(48, ExpressionsMatter.expressionsMatter(6, 7, 1));
    }

    @Test
    public void checkMixedValues() {
        Assert.assertEquals(60, ExpressionsMatter.expressionsMatter(2, 10,  3));
        Assert.assertEquals(27, ExpressionsMatter.expressionsMatter(1,  8,  3));
        Assert.assertEquals(126, ExpressionsMatter.expressionsMatter(9,  7,  2));
        Assert.assertEquals(20, ExpressionsMatter.expressionsMatter(1,  1, 10));
        Assert.assertEquals(18, ExpressionsMatter.expressionsMatter(9,  1,  1));
        Assert.assertEquals(300, ExpressionsMatter.expressionsMatter(10,  5,  6));
        Assert.assertEquals(12, ExpressionsMatter.expressionsMatter(1, 10,  1));
    }

}