package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Node;
import ru.codewars.eightkyu.Stringify;
import org.junit.Test;

public class StringifyTest {
    @Test
    public void sampleTests() {
        Assert.assertEquals("1 -> 2 -> 3 -> null", Stringify.stringify(new Node(1, new Node(2, new Node(3)))));
        Assert.assertEquals("0 -> 1 -> 4 -> 9 -> 16 -> null", Stringify.stringify(new Node(0, new Node(1, new Node(4, new Node(9, new Node(16)))))));
        Assert.assertEquals("null", Stringify.stringify(null));
    }

}