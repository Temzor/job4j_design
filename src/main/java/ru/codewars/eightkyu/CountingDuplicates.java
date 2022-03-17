package ru.codewars.eightkyu;

import java.util.ArrayList;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        text = text.toLowerCase() + " ";
        int count = 0;
        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            String[] split = text.split(String.valueOf(text.charAt(i)));
            if ((split.length > 2) && !chars.contains(text.charAt(i))) {
                count++;
                chars.add(text.charAt(i));
            }
        }
        return count;
    }
}
