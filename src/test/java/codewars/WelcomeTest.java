package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Welcome;
import org.junit.Test;

public class WelcomeTest {
    @Test
    public void exampleTest() {
        Assert.assertEquals("Your function should have returned 'Welcome'. Try again.",
                "Welcome", Welcome.greet("english"));
        Assert.assertEquals("Your function should have returned 'Welkom'. Try again.",
                "Welkom", Welcome.greet("dutch"));
        Assert.assertEquals("Your function should have returned 'Welcome'. Try again.",
                "Welcome", Welcome.greet("IP_ADDRESS_INVALID"));
    }

}