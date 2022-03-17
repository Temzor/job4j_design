package codewars;

import ru.codewars.eightkyu.Money;
import org.junit.Assert;
import org.junit.Test;

public class MoneyTest {
    @Test
    public void test() {
        System.out.println("Fixed Tests calculateYears");
        Assert.assertEquals(3, Money.calculateYears(1000, 0.05, 0.18, 1100));
        Assert.assertEquals(14, Money.calculateYears(1000, 0.01625, 0.18, 1200));
        Assert.assertEquals(0, Money.calculateYears(1000, 0.05, 0.18, 1000));
    }

}