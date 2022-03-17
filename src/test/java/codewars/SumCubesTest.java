package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.SumCubes;
import org.junit.Test;

public class SumCubesTest {
    @Test
    public void exampleTests() {
        Assert.assertEquals(1, SumCubes.sumCubes(1));
        Assert.assertEquals(9, SumCubes.sumCubes(2));
        Assert.assertEquals(36, SumCubes.sumCubes(3));
        Assert.assertEquals(100, SumCubes.sumCubes(4));
        Assert.assertEquals(3025, SumCubes.sumCubes(10));
        Assert.assertEquals(69058203055025625L, SumCubes.sumCubes(22925));
    }

}