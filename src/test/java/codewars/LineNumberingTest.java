package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.LineNumbering;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class LineNumberingTest {
    @Test
    public void basicTests() {
        Assert.assertEquals(Collections.emptyList(), LineNumbering.number(Collections.emptyList()));
        Assert.assertEquals(Arrays.asList("1: a", "2: b", "3: c"), LineNumbering.number(Arrays.asList("a", "b", "c")));
        Assert.assertEquals(Arrays.asList("1: ", "2: ", "3: ", "4: ", "5: "), LineNumbering.number(Arrays.asList("", "", "", "", "")));
    }

}