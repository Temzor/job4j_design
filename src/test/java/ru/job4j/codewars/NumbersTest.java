package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {
    @Test
    public void test01() {
        assertEquals(4.66, Numbers.twoDecimalPlaces(4.659725356), 0.00);
    }

    @Test
    public void test02() {
        assertEquals(173735326.38, Numbers.twoDecimalPlaces(173735326.3783732637948948), 0.00);
    }

    @Test
    public void test03() {
        assertEquals(0.79, Numbers.twoDecimalPlaces(0.7914333946334626), 0.00);
    }

}