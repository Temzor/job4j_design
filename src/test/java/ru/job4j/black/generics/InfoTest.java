package ru.job4j.black.generics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InfoTest {

    @Test
    public void testT() {
        Info1<String> result = new Info1<>("test");
        assertEquals("test", result.getValue());
    }


}