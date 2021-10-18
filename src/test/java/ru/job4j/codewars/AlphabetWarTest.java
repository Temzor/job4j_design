package ru.job4j.codewars;

import codewars.AlphabetWar;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabetWarTest {
    @Test
    public void basicTest() {
        assertEquals("Right side wins!", AlphabetWar.alphabetWar("z"));
        assertEquals("Let's fight again!", AlphabetWar.alphabetWar("zdqmwpbs"));
        assertEquals("Right side wins!", AlphabetWar.alphabetWar("zzzzs"));
        assertEquals("Left side wins!", AlphabetWar.alphabetWar("wwwwwwz"));
    }

}