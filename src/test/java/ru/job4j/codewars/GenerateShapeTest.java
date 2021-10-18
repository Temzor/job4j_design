package ru.job4j.codewars;

import codewars.GenerateShape;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenerateShapeTest {
    @Test
    public void exampleTests() {
        assertEquals("+++\n+++\n+++", GenerateShape.generateShape(3));
        assertEquals("+++++\n+++++\n+++++\n+++++\n+++++", GenerateShape.generateShape(5));
        assertEquals("++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++", GenerateShape.generateShape(8));
    }
}