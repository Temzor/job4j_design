package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Converter;
import org.junit.Test;

public class ConverterTest {
    @Test
    public void test1() {
        Assert.assertEquals(3.54f, Converter.mpgToKPM(10), 0.001f);
    }

    @Test
    public void test2() {
        Assert.assertEquals(7.08f, Converter.mpgToKPM(20), 0.001f);
    }

    @Test
    public void test3() {
        Assert.assertEquals(10.62f, Converter.mpgToKPM(30), 0.001f);
    }

}