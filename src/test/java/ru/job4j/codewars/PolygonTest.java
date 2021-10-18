package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class PolygonTest {
    @Test
    public void test1(){
        Polygon poly=new Polygon(4, 5);
        assertEquals("5,000", String.format("%.3f", poly.circleDiameter()));
    }

    @Test
    public void test2() {
        Polygon poly=new Polygon(8, 9);
        assertEquals("21,728", String.format("%.3f", poly.circleDiameter()));
    }

    @Test
    public void test3() {
        Polygon poly=new Polygon(3, 4);
        assertEquals("2,309", String.format("%.3f", poly.circleDiameter()));
    }
}
