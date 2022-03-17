package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.GhostCode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GhostCodeTest {
    @Test
    public void exampleTests() {
        String result = GhostCode.helloName("Javatlacati");
        Assert.assertEquals("Hello my name is Javatlacati is not " + result, "Hello my name is Javatlacati", result);
    }

}