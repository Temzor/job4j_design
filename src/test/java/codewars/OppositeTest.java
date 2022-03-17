package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Opposite;
import org.junit.Test;

public class OppositeTest {
    @Test
    public void tests() {
        Assert.assertEquals(-1, Opposite.opposite(1));
    }
}

