package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.PythagoreanTriple;
import org.junit.Test;

public class PythagoreanTripleTest {
    static int[] p1 = {3, 4, 5};
    static int[] p2 = {3, 5, 7};

    PythagoreanTriple pT = new PythagoreanTriple();

    @Test
    public void validTriple() {
        Assert.assertEquals(1, pT.pythagoreanTriple(p1));
    }

    @Test
    public void invalidTriple() {
        Assert.assertEquals(0, pT.pythagoreanTriple(p2));
    }

}