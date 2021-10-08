package ru.job4j.codewars;

public class Stringify {
    public static String stringify(Node list) {
        return list == null ? "null" : list.getData() + " -> " + stringify(list.getNext());
    }
}
