package codewars;

import codewars.KeepHydrated;
import org.junit.Test;

import static org.junit.Assert.*;

public class KeepHydratedTest {
    KeepHydrated kh = new KeepHydrated();

    @Test
    public void sampleTest1() {

        assertEquals(1, kh.liters(2));

    }
    @Test
    public void sampleTest2()  {

        assertEquals(0, kh.liters(0.97));

    }
    @Test
    public void sampleTest3()  {

        assertEquals(7, kh.liters(14.64));

    }
    @Test
    public void sampleTest4()  {

        assertEquals(800, kh.liters(1600.20));

    }
    @Test
    public void sampleTest5()  {

        assertEquals(40, kh.liters(80));

    }
}
