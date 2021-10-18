package ru.job4j.codewars;

import codewars.Dinglemouse1;
import org.junit.Test;

import static org.junit.Assert.*;

public class Dinglemouse1Test {
    @Test
    public void test() {
        assertEquals(123, Dinglemouse1.INST.plus100(23));
        assertEquals(134, Dinglemouse1.INST.plus100(34));
        assertEquals(64, Dinglemouse1.INST.plus100(-36));
    }
}