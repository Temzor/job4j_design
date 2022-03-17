package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Greeter;
import org.junit.Test;

public class GreeterTest {
    @Test
    public void test() {
        Assert.assertEquals("should greet some people normally",
                "Hello, Jim!", Greeter.greet("Jim"));
        Assert.assertEquals("should greet some people normally",
                "Hello, Jane!", Greeter.greet("Jane"));
        Assert.assertEquals("should greet some people normally",
                "Hello, Simon!", Greeter.greet("Simon"));
        Assert.assertEquals("should greet Johnny a little bit more special",
                "Hello, my love!", Greeter.greet("Johnny"));
    }

}