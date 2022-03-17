package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.SwitchItUp;
import org.junit.Test;

public class SwitchItUpTest {
    @Test
    public void basicTests() {
        Assert.assertEquals("One", SwitchItUp.switchItUp(1));
        Assert.assertEquals("Three", SwitchItUp.switchItUp(3));
        Assert.assertEquals("Five", SwitchItUp.switchItUp(5));
    }

}