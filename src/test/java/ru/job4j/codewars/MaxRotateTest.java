package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxRotateTest {
    private static void testing(long actual, long expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test() {
        System.out.println("Fixed Tests maxRot");
        testing(MaxRotate.maxRot(38458215), 85821534);
        testing(MaxRotate.maxRot(195881031), 988103115);
        testing(MaxRotate.maxRot(896219342), 962193428);
        testing(MaxRotate.maxRot(69418307), 94183076);
    }

}