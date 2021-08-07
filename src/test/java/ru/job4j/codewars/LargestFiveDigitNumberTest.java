package ru.job4j.codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LargestFiveDigitNumberTest {
    @Test
    public void exampleTests() {
        Assertions.assertEquals(83910, LargestFiveDigitNumber.solve("283910"));
        Assertions.assertEquals(67890, LargestFiveDigitNumber.solve("1234567890"));
    }

}