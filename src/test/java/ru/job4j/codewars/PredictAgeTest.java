package ru.job4j.codewars;

import codewars.PredictAge;
import org.junit.Test;

import static org.junit.Assert.*;

public class PredictAgeTest {
    @Test
    public void fixedTests() {
        assertEquals(86, PredictAge.predictAge(65, 60, 75, 55, 60, 63, 64, 45));
        assertEquals(79, PredictAge.predictAge(32, 54, 76, 65, 34, 63, 64, 45));
    }


}