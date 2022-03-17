package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.GrassHopper2;
import org.junit.Test;

public class GrassHopper2Test {
    @Test
    public void test1() {
        Assert.assertEquals("Hello, Mr. Spock",
                GrassHopper2.sayHello("Mr. Spock"));
    }
    @Test
    public void test2() {
        Assert.assertEquals("Hello, Captain Kirk",
                GrassHopper2.sayHello("Captain Kirk"));
    }
    @Test
    public void test3() {
        Assert.assertEquals("Hello, Liutenant Uhura",
                GrassHopper2.sayHello("Liutenant Uhura"));
    }
    @Test
    public void test4() {
        Assert.assertEquals("Hello, Dr. McCoy",
                GrassHopper2.sayHello("Dr. McCoy"));
    }

}