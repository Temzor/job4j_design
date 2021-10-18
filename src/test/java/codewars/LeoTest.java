package codewars;

import codewars.Leo;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeoTest {
    @Test
    public void oscar88() {
        assertEquals("Leo finally won the oscar! Leo is happy", Leo.leo(88));
    }

    @Test
    public void oscar86() {
        assertEquals("Not even for Wolf of wallstreet?!", Leo.leo(86));
    }

    @Test
    public void below88() {
        assertEquals("When will you give Leo an Oscar?", Leo.leo(87));
        assertEquals("When will you give Leo an Oscar?", Leo.leo(83));
        assertEquals("When will you give Leo an Oscar?", Leo.leo(85));
    }

    @Test
    public void over88() {
        assertEquals("Leo got one already!", Leo.leo(89));
        assertEquals("Leo got one already!", Leo.leo(90));
        assertEquals("Leo got one already!", Leo.leo(95));
    }

}