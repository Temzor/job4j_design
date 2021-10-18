package ru.job4j.codewars;

import codewars.Banjo;
import org.junit.Test;

import static org.junit.Assert.*;

public class BanjoTest {
    @Test
    public void peopleThatPlayBanjo() {
        assertEquals("Nope!", "Martin does not play banjo", Banjo.areYouPlayingBanjo("Martin"));
        assertEquals("Nope!", "Rikke plays banjo", Banjo.areYouPlayingBanjo("Rikke"));
    }

}