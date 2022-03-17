package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.GetMiddle;
import org.junit.Test;

public class GetMiddleTest {
    @Test
    public void evenTests() {
        Assert.assertEquals("es", GetMiddle.getMiddle("test"));
        Assert.assertEquals("dd", GetMiddle.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        Assert.assertEquals("t", GetMiddle.getMiddle("testing"));
        Assert.assertEquals("A", GetMiddle.getMiddle("A"));
    }

}