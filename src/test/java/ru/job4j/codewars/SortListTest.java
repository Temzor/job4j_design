package ru.job4j.codewars;

import codewars.SortList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class SortListTest {
    @Test
    public void basicTest() {
        ArrayList<String> sorted = new ArrayList<>();
        ArrayList<String> strs = new ArrayList<>();
        Collections.addAll(strs, "Algebra", "History", "Geometry", "English");
        Collections.addAll(sorted, "Algebra", "English", "Geometry", "History");
        assertEquals(sorted, SortList.sort(strs));
    }

    @Test
    public void symbolsTest() {
        ArrayList<String> sorted = new ArrayList<>();
        ArrayList<String> strs = new ArrayList<>();
        Collections.addAll(strs, "Alg#bra", "$istory", "Geom^try", "**English");
        Collections.addAll(sorted, "$istory", "**English", "Alg#bra", "Geom^try");
        assertEquals(sorted, SortList.sort(strs));
    }

}