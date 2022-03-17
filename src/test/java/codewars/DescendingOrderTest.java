package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.DescendingOrder;
import org.junit.Test;

public class DescendingOrderTest {
    @Test
    public void test01() {
        Assert.assertEquals(0, DescendingOrder.sortDesc(0));
    }

    @Test
    public void test02() {
        Assert.assertEquals(51, DescendingOrder.sortDesc(15));
    }


    @Test
    public void test03() {
        Assert.assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }

}