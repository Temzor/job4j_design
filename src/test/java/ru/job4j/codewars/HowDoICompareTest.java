package ru.job4j.codewars;

import codewars.HowDoICompare;
import org.junit.Test;

import static org.junit.Assert.*;

public class HowDoICompareTest {
    @Test
    public void test() throws Exception {
        for (Object[] t: TESTS) {
            assertEquals(t[1], HowDoICompare.whatIs((Integer) t[0]));
        }
    }

    static final Object[][] TESTS = {
            {0, "nothing"},
            {123, "nothing"},
            {-1, "nothing"},
            {42, "everything"},
            {42 * 42, "everything squared"},
    };

}