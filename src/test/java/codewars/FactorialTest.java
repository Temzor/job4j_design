package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Factorial;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {
    private Factorial fact;

    @Before
    public void initFactorial() {
        fact = new Factorial();
    }

    @After
    public void afterFactorial() {
        fact = null;
    }

    @Test
    public void testFactorial0() {
        Assert.assertEquals(1, fact.factorial(0));
    }

    @Test
    public void testFactorial3() {
        Assert.assertEquals(6, fact.factorial(3));
    }

    @Test
    public void testFactorial5() {
        Assert.assertEquals(120, fact.factorial(5));
    }

}