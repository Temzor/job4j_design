package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Kata;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void simpleAdd() {
        Assert.assertEquals("Kata.add(3,5)", Kata.add(3).applyAsInt(5), 8);
    }
}