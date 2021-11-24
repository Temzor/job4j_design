package codewars;

import codewars.ZywOo2;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZywOo2Test {
    @Test
    public void basicTests() {
        assertEquals("More than a handful!", ZywOo2.howManyDalmations(26));
        assertEquals("Hardly any", ZywOo2.howManyDalmations(8));
        assertEquals("More than a handful!", ZywOo2.howManyDalmations(14));
        assertEquals("Woah that's a lot of dogs!", ZywOo2.howManyDalmations(80));
        assertEquals("Woah that's a lot of dogs!", ZywOo2.howManyDalmations(100));
        assertEquals("101 DALMATIANS!!!", ZywOo2.howManyDalmations(101));
    }

}