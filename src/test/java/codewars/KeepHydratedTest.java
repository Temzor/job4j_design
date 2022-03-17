package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.KeepHydrated;
import org.junit.Test;

public class KeepHydratedTest {
    KeepHydrated kh = new KeepHydrated();

    @Test
    public void sampleTest1() {

        Assert.assertEquals(1, kh.liters(2));

    }
    @Test
    public void sampleTest2()  {

        Assert.assertEquals(0, kh.liters(0.97));

    }
    @Test
    public void sampleTest3()  {

        Assert.assertEquals(7, kh.liters(14.64));

    }
    @Test
    public void sampleTest4()  {

        Assert.assertEquals(800, kh.liters(1600.20));

    }
    @Test
    public void sampleTest5()  {

        Assert.assertEquals(40, kh.liters(80));

    }
}
