package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class OppositeTest {
    @Test
    public void tests() {
        assertEquals(-1, Opposite.opposite(1));
    }
}

