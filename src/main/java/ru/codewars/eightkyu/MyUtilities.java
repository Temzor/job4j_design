package ru.codewars.eightkyu;

import java.lang.*;

public class MyUtilities {

    public boolean isDigit(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
