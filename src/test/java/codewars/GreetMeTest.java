package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.GreetMe;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreetMeTest {
    @Test
    public void basicTests() {
        Assert.assertEquals("Hello Riley!", GreetMe.greet("riley"));
        Assert.assertEquals("Hello Billy!", GreetMe.greet("BILLY"));
    }

}