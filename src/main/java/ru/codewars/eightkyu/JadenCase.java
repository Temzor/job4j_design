package ru.codewars.eightkyu;


public class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.equals("")) {
            return null;
        }

        char[] array = phrase.toCharArray();

        for (int x = 0; x < array.length; x++) {
            if (x == 0 || array[x - 1] == ' ') {
                array[x] = Character.toUpperCase(array[x]);
            }
        }

        return new String(array);
    }

}