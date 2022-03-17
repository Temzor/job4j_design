package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.PushAnObjectIntoArray;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PushAnObjectIntoArrayTest {

    @Test
    public void testSomething() {
        ArrayList<String> items = PushAnObjectIntoArray.push();
        Assert.assertEquals(1, items.size());
        Assert.assertEquals("an object", items.get(0));
    }
}