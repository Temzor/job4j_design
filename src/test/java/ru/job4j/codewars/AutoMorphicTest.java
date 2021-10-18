package ru.job4j.codewars;

import codewars.AutoMorphic;
import org.junit.Test;

import static org.junit.Assert.*;

public class AutoMorphicTest {
    @Test
    public void oneDigitNumber() {
        assertEquals("Automorphic", AutoMorphic.autoMorphic(1));
        assertEquals("Not!!",       AutoMorphic.autoMorphic(3));
        assertEquals("Automorphic", AutoMorphic.autoMorphic(6));
        assertEquals("Not!!",       AutoMorphic.autoMorphic(9));
    }
    @Test
    public void twoDigitNumber() {
        assertEquals("Automorphic", AutoMorphic.autoMorphic(25));
        assertEquals("Not!!",       AutoMorphic.autoMorphic(13));
        assertEquals("Automorphic", AutoMorphic.autoMorphic(76));
        assertEquals("Not!!",       AutoMorphic.autoMorphic(95));
    }
    @Test
    public void largerNumber() {
        assertEquals("Automorphic", AutoMorphic.autoMorphic(625));
        assertEquals("Not!!",       AutoMorphic.autoMorphic(225));
        assertEquals("Not!!",       AutoMorphic.autoMorphic(425));
        assertEquals("Not!!",       AutoMorphic.autoMorphic(399));
    }

}