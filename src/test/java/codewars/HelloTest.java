package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Hello;
import org.junit.Test;

public class HelloTest {
    @Test
    public void test1() throws Exception {
        Hello h = new Hello();
        String[] name = {"John", "Smith"};
        Assert.assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!",
                h.sayHello(name, "Phoenix", "Arizona"));
    }

}