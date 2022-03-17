package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Multiples;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplesTest {
    @Test
    public void test() {
        Assert.assertEquals(23, new Multiples().solution(10));
    }

}