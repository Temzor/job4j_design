package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.NthEven;
import org.junit.Test;

public class NthEvenTest {
    @Test
    public void exampleTests() {
        Assert.assertEquals(0, NthEven.nthEven(1));
        Assert.assertEquals(2, NthEven.nthEven(2));
        Assert.assertEquals(4, NthEven.nthEven(3));
        Assert.assertEquals(198, NthEven.nthEven(100));
        Assert.assertEquals(2597466, NthEven.nthEven(1298734));
    }

}