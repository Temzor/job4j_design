package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Triangular;
import org.junit.Test;

public class TriangularTest {
    @Test
    public void fixedTests() {
        Assert.assertEquals(3, Triangular.triangular(2));
        Assert.assertEquals(10, Triangular.triangular(4));
        Assert.assertEquals(813450, Triangular.triangular(1275));
        Assert.assertEquals(0, Triangular.triangular(0));
        Assert.assertEquals(0, Triangular.triangular(-1));
        Assert.assertEquals(1593385926, Triangular.triangular(56451));
    }

}