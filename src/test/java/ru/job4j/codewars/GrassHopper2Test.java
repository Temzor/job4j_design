package ru.job4j.codewars;

import codewars.GrassHopper2;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrassHopper2Test {
    @Test
    public void test1() {
        assertEquals("Hello, Mr. Spock",
                GrassHopper2.sayHello("Mr. Spock"));
    }
    @Test
    public void test2() {
        assertEquals("Hello, Captain Kirk",
                GrassHopper2.sayHello("Captain Kirk"));
    }
    @Test
    public void test3() {
        assertEquals("Hello, Liutenant Uhura",
                GrassHopper2.sayHello("Liutenant Uhura"));
    }
    @Test
    public void test4() {
        assertEquals("Hello, Dr. McCoy",
                GrassHopper2.sayHello("Dr. McCoy"));
    }

}