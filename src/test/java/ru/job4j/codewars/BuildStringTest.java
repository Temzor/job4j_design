package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuildStringTest {
    @Test
    public void fixedTests() {
        assertEquals(BuildString.buildString("Cheese", "Milk", "Chocolate"), "I like Cheese, Milk, Chocolate!");
        assertEquals(BuildString.buildString("Cheese", "Milk"), "I like Cheese, Milk!");
        assertEquals(BuildString.buildString("Chocolate"), "I like Chocolate!");
    }

}