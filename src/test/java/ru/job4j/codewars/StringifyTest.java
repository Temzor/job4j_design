package ru.job4j.codewars;

import codewars.Node;
import codewars.Stringify;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringifyTest {
    @Test
    public void sampleTests() {
        assertEquals("1 -> 2 -> 3 -> null", Stringify.stringify(new Node(1, new Node(2, new Node(3)))));
        assertEquals("0 -> 1 -> 4 -> 9 -> 16 -> null", Stringify.stringify(new Node(0, new Node(1, new Node(4, new Node(9, new Node(16)))))));
        assertEquals("null", Stringify.stringify(null));
    }

}