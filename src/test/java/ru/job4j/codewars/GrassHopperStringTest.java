package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class GrassHopperStringTest {
    @Test
    public void test1() {
        assertEquals('A', GrassHopperString.getGrade(95, 90, 93));
        assertEquals('A', GrassHopperString.getGrade(100, 85, 96));
        assertEquals('A', GrassHopperString.getGrade(92, 93, 94));
        assertEquals('A', GrassHopperString.getGrade(100, 100, 100));
    }
    @Test
    public void test2() {
        assertEquals('B', GrassHopperString.getGrade(70, 70, 100));
        assertEquals('B', GrassHopperString.getGrade(82, 85, 87));
        assertEquals('B', GrassHopperString.getGrade(84, 79, 85));
    }
    @Test
    public void test3() {
        assertEquals('C', GrassHopperString.getGrade(70, 70, 70));
        assertEquals('C', GrassHopperString.getGrade(75, 70, 79));
        assertEquals('C', GrassHopperString.getGrade(60, 82, 76));
    }
    @Test
    public void test4() {
        assertEquals('D', GrassHopperString.getGrade(65, 70, 59));
        assertEquals('D', GrassHopperString.getGrade(66, 62, 68));
        assertEquals('D', GrassHopperString.getGrade(58, 62, 70));
    }
    @Test
    public void test5() {
        assertEquals('F', GrassHopperString.getGrade(44, 55, 52));
        assertEquals('F', GrassHopperString.getGrade(48, 55, 52));
        assertEquals('F', GrassHopperString.getGrade(58, 59, 60));
        assertEquals('F', GrassHopperString.getGrade(0, 0, 0));
    }

}