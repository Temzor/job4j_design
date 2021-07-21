package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringToArrayTest {
    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"Robin", "Singh"}, StringToArray.stringToArray("Robin Singh"));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"},
                StringToArray.stringToArray("I love arrays they are my favorite"));
    }

}