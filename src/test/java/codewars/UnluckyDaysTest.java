package codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnluckyDaysTest {
    @Test
    public void testSomething() {
        assertEquals(3, UnluckyDays.unluckyDays(2015));
        assertEquals(1, UnluckyDays.unluckyDays(1986));
    }

}