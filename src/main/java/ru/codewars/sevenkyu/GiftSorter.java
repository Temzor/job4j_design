package ru.codewars.sevenkyu;

import java.util.Arrays;

public class GiftSorter {
    public String sortGiftCode(String code) {
        char[] chars = code.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
