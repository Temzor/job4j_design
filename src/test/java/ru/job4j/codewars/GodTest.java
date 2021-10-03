package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class GodTest {
    @Test
    public void makingAdam() {
        Human[] paradise = God.create();
        assertTrue("Adam are a man", paradise[0] instanceof Man);

    }
}