package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.ChromosomeCheck;
import org.junit.Test;

public class ChromosomeCheckTest {
    @Test
    public void tests() {
        Assert.assertEquals("Congratulations! You're going to have a son.", ChromosomeCheck.chromosomeCheck("XY"));
        Assert.assertEquals("Congratulations! You're going to have a daughter.", ChromosomeCheck.chromosomeCheck("XX"));
    }

}