package ru.codewars.eightkyu;

import java.util.Arrays;

public class Beginner {
    public static boolean check(Object[] a, Object x) {
       return Arrays
               .asList(a)
               .contains(x);
    }
}
