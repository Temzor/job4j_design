package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.HelloWorld;
import org.junit.Test;

public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        Assert.assertEquals("hello world!", HelloWorld.greet());
    }
}