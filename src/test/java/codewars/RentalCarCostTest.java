package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.RentalCarCost;
import org.junit.Test;

public class RentalCarCostTest {
    @Test
    public void under3Tests() {
        Assert.assertEquals(40, RentalCarCost.rentalCarCost(1));
        Assert.assertEquals(80, RentalCarCost.rentalCarCost(2));
    }

    @Test
    public void under7Tests() {
        Assert.assertEquals(100, RentalCarCost.rentalCarCost(3));
        Assert.assertEquals(140, RentalCarCost.rentalCarCost(4));
        Assert.assertEquals(180, RentalCarCost.rentalCarCost(5));
        Assert.assertEquals(220, RentalCarCost.rentalCarCost(6));
    }

    @Test
    public void over7Tests() {
        Assert.assertEquals(230, RentalCarCost.rentalCarCost(7));
        Assert.assertEquals(270, RentalCarCost.rentalCarCost(8));
        Assert.assertEquals(310, RentalCarCost.rentalCarCost(9));
        Assert.assertEquals(350, RentalCarCost.rentalCarCost(10));
    }

}