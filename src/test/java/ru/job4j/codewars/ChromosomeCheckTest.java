package ru.job4j.codewars;

import codewars.ChromosomeCheck;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChromosomeCheckTest {
    @Test
    public void tests() {
        assertEquals("Congratulations! You're going to have a son.", ChromosomeCheck.chromosomeCheck("XY"));
        assertEquals("Congratulations! You're going to have a daughter.", ChromosomeCheck.chromosomeCheck("XX"));
    }

}