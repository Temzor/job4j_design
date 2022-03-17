package ru.codewars.eightkyu;

public class Stringify {
    public static String stringify(Node list) {
        return list == null ? "null" : list.getData() + " -> " + stringify(list.getNext());
    }
}
