package codewars;

import ru.codewars.eightkyu.PangramChecker;
import org.junit.Test;

import static org.junit.Assert.*;

public class PangramCheckerTest {
    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        PangramChecker pc = new PangramChecker();
        assertTrue(pc.check(pangram1));
    }
    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        PangramChecker pc = new PangramChecker();
        assertFalse(pc.check(pangram2));
    }
    @Test
    public void test3() {
        String pangram3 = "Cwm fjord bank glyphs vext quiz";
        PangramChecker pc = new PangramChecker();
        assertTrue(pc.check(pangram3));
    }

}