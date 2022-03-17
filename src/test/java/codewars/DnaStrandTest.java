package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.DnaStrand;
import org.junit.Test;

public class DnaStrandTest {
    @Test
    public void test01() {
        Assert.assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
    }
    @Test
    public void test02() {
        Assert.assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
    }
    @Test
    public void test03() {
        Assert.assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
    }

}