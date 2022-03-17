package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Numbers;
import org.junit.Test;

public class NumbersTest {
    @Test
    public void test01() {
        Assert.assertEquals(4.66, Numbers.twoDecimalPlaces(4.659725356), 0.00);
    }

    @Test
    public void test02() {
        Assert.assertEquals(173735326.38, Numbers.twoDecimalPlaces(173735326.3783732637948948), 0.00);
    }

    @Test
    public void test03() {
        Assert.assertEquals(0.79, Numbers.twoDecimalPlaces(0.7914333946334626), 0.00);
    }

}