package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Solve;
import org.junit.Test;

public class SolveTest {
    @Test
    public void bsicTests() {
        Assert.assertEquals("code", Solve.solve("code"));
        Assert.assertEquals("CODE", Solve.solve("CODe"));
        Assert.assertEquals("code", Solve.solve("COde"));
        Assert.assertEquals("code", Solve.solve("Code"));
        Assert.assertEquals("", Solve.solve(""));
    }

}