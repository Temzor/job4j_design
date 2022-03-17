package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.RemoveExclamationMarks;
import org.junit.Test;

public class RemoveExclamationMarksTest {
    @Test
    public void testSimpleString1() {
        Assert.assertEquals("Hello World", RemoveExclamationMarks.removeExclamationMarks("Hello World!"));
    }

}