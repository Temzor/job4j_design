package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Bio;
import org.junit.Test;

public class BioTest {
    @Test
    public void testDna() {
        Bio b = new Bio();
        Assert.assertEquals("UUUU", b.dnaToRna("TTTT"));
    }

    @Test
    public void testDna2() {
        Bio b = new Bio();
        Assert.assertEquals("GCAU", b.dnaToRna("GCAT"));
    }

}