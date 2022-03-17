package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.EasyLogs;
import org.junit.Test;

public class EasyLogsTest {
    @Test
    public void exampleTests() {
        Assert.assertEquals(0.7781512503836435, EasyLogs.logs(10, 2, 3), 0.0000001);
        Assert.assertEquals(1.1132827525593785, EasyLogs.logs(5, 2, 3), 0.0000001);
        Assert.assertEquals(0.25938375012788123, EasyLogs.logs(1000, 2, 3), 0.0000001);
    }
}