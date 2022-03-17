package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.SeatsInTheater;
import org.junit.Test;

public class SeatsInTheaterTest {
    @Test
    public void exampleTests() {
        Assert.assertEquals(96, SeatsInTheater.seatsInTheater(16, 11, 5, 3));
        Assert.assertEquals(0, SeatsInTheater.seatsInTheater(1, 1, 1, 1));
        Assert.assertEquals(18, SeatsInTheater.seatsInTheater(13, 6, 8, 3));
        Assert.assertEquals(99, SeatsInTheater.seatsInTheater(60, 100, 60, 1));
        Assert.assertEquals(0, SeatsInTheater.seatsInTheater(1000, 1000, 1000, 1000));
    }

}