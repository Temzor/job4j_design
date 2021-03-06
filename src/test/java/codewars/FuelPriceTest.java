package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.FuelPrice;
import org.junit.Test;

public class FuelPriceTest {
    @Test
    public void exampleTests() {
        Assert.assertEquals(5.65d, FuelPrice.fuelPrice(5, 1.23d), 0.001d);
        Assert.assertEquals(18.40d, FuelPrice.fuelPrice(8, 2.5d), 0.001d);
        Assert.assertEquals(27.50d, FuelPrice.fuelPrice(5, 5.6d),  0.001d);
    }

}