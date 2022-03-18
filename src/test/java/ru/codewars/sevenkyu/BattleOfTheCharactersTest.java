package ru.codewars.sevenkyu;

import org.junit.Assert;
import org.junit.Test;

public class BattleOfTheCharactersTest {
    @Test
    public void basicTests() {
        doTest("AAA",  "Z",    "Z");
        doTest("ONE",  "TWO",  "TWO");
        doTest("ONE",  "NEO",  "Tie!");
        doTest("FOUR", "FIVE", "FOUR");
        doTest("PEOHQT", "GMQCDBTJ", "PEOHQT");
    }
    private void doTest(final String x, final String y, final String expected) {
        Assert.assertEquals(expected, BattleOfTheCharacters.battle(x, y));
    }
}