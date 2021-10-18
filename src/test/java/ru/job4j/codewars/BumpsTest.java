package ru.job4j.codewars;

import codewars.Bumps;
import org.junit.Test;

import static org.junit.Assert.*;

public class BumpsTest {
    @Test
    public void basicTest() {
        assertEquals(Bumps.bumps("n"), "Woohoo!");
        assertEquals(Bumps.bumps("_nnnnnnn_n__n______nn__nn_nnn"), "Car Dead");
        assertEquals(Bumps.bumps("______n___n_"), "Woohoo!");
        assertEquals(Bumps.bumps("nnnnnnnnnnnnnnnnnnnnn"), "Car Dead");
    }

}