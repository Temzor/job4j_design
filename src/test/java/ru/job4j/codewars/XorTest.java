package ru.job4j.codewars;

import codewars.Xor;
import org.junit.Test;

import static org.junit.Assert.*;

public class XorTest {
    private static void testing(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void testBasic() {
        System.out.println("Testing basics.");
        testing(Xor.xor(false, false), false);
        testing(Xor.xor(true, false), true);
        testing(Xor.xor(false, true), true);
        testing(Xor.xor(true, true), false);
    }
    @Test
    public void testNested() {
        System.out.println("Testing nested calls.");
        testing(Xor.xor(false, Xor.xor(false, false)), false);
        testing(Xor.xor(Xor.xor(true, false), false), true);
        testing(Xor.xor(Xor.xor(true, true), false), false);
        testing(Xor.xor(true, Xor.xor(true, true)), true);
        testing(Xor.xor(Xor.xor(false, false), Xor.xor(false, false)), false);
        testing(Xor.xor(Xor.xor(false, false), Xor.xor(false, true)), true);
        testing(Xor.xor(Xor.xor(true, false), Xor.xor(false, false)), true);
        testing(Xor.xor(Xor.xor(true, false), Xor.xor(true, false)), false);
        testing(Xor.xor(Xor.xor(true, true), Xor.xor(true, false)), true);
        testing(Xor.xor(Xor.xor(true, Xor.xor(true, true)), Xor.xor(Xor.xor(true, true), false)), true);
    }

}