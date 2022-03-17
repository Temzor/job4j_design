package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Greet;
import org.junit.Test;

public class GreetTest {
    @Test
    public void basicTests() {
        Assert.assertEquals("For inputs \"Daniel\" and \"Daniel\"", "Hello boss", Greet.greet("Daniel", "Daniel"));
        Assert.assertEquals("For inputs \"Greg\" and \"Daniel\"", "Hello guest", Greet.greet("Greg", "Daniel"));
    }

}