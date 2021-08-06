package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class GoalsTest {
    @Test
    public void basicTests() {
        assertEquals(0, Goals.goals(0, 0, 0));
        assertEquals(58, Goals.goals(43, 10, 5));
    }

}