package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Goals;
import org.junit.Test;

public class GoalsTest {
    @Test
    public void basicTests() {
        Assert.assertEquals(0, Goals.goals(0, 0, 0));
        Assert.assertEquals(58, Goals.goals(43, 10, 5));
    }

}