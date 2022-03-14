package ru.codewars.eightkyu;

import org.junit.Assert;
import org.junit.Test;

public class ReflectionsTest {

    @Test
    public void thenTwoPlus() {
        Reflections reflections = new Reflections();
        int[] p = new int[] {0, 0};
        int[] q = new int[] {1, 1};
        Assert.assertArrayEquals(new int[] {2, 2}, reflections.reflectPoint(p, q));
    }

    @Test
    public void thenZero() {
        Reflections reflections = new Reflections();
        int[] p = new int[] {0, 0};
        int[] q = new int[] {0, 0};
        Assert.assertArrayEquals(new int[] {0, 0}, reflections.reflectPoint(p, q));
    }

    @Test
    public void thenDifferenceP() {
        Reflections reflections = new Reflections();
        int[] p = new int[] {-5, 20};
        int[] q = new int[] {4, 10};
        Assert.assertArrayEquals(new int[] {13, 0}, reflections.reflectPoint(p, q));
    }

    @Test
    public void thenDifferenceQ() {
        Reflections reflections = new Reflections();
        int[] p = new int[] {5, 20};
        int[] q = new int[] {-4, 10};
        Assert.assertArrayEquals(new int[] {-13, 0}, reflections.reflectPoint(p, q));
    }

    @Test
    public void thenDTwoNegative() {
        Reflections reflections = new Reflections();
        int[] p = new int[] {-5, -20};
        int[] q = new int[] {-4, -50};
        Assert.assertArrayEquals(new int[] {-3, -80}, reflections.reflectPoint(p, q));
    }

}