package ru.job4j.codewars;

import codewars.GrassHopper3;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrassHopper3Test {
    @Test
    public void testA() {
        assertEquals("10.0 is above freezing temperature", GrassHopper3.weatherInfo(50));
    }
    @Test
    public void testB() {
        assertEquals("-5.0 is freezing temperature", GrassHopper3.weatherInfo(23));
    }

}