package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.GrassHopperString;
import org.junit.Test;

public class GrassHopperStringTest {
    @Test
    public void test1() {
        Assert.assertEquals('A', GrassHopperString.getGrade(95, 90, 93));
        Assert.assertEquals('A', GrassHopperString.getGrade(100, 85, 96));
        Assert.assertEquals('A', GrassHopperString.getGrade(92, 93, 94));
        Assert.assertEquals('A', GrassHopperString.getGrade(100, 100, 100));
    }
    @Test
    public void test2() {
        Assert.assertEquals('B', GrassHopperString.getGrade(70, 70, 100));
        Assert.assertEquals('B', GrassHopperString.getGrade(82, 85, 87));
        Assert.assertEquals('B', GrassHopperString.getGrade(84, 79, 85));
    }
    @Test
    public void test3() {
        Assert.assertEquals('C', GrassHopperString.getGrade(70, 70, 70));
        Assert.assertEquals('C', GrassHopperString.getGrade(75, 70, 79));
        Assert.assertEquals('C', GrassHopperString.getGrade(60, 82, 76));
    }
    @Test
    public void test4() {
        Assert.assertEquals('D', GrassHopperString.getGrade(65, 70, 59));
        Assert.assertEquals('D', GrassHopperString.getGrade(66, 62, 68));
        Assert.assertEquals('D', GrassHopperString.getGrade(58, 62, 70));
    }
    @Test
    public void test5() {
        Assert.assertEquals('F', GrassHopperString.getGrade(44, 55, 52));
        Assert.assertEquals('F', GrassHopperString.getGrade(48, 55, 52));
        Assert.assertEquals('F', GrassHopperString.getGrade(58, 59, 60));
        Assert.assertEquals('F', GrassHopperString.getGrade(0, 0, 0));
    }

}