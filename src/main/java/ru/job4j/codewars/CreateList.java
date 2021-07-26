package ru.job4j.codewars;

import java.util.ArrayList;
import java.util.List;

public class CreateList {
    public static List createList(int number) {
        List list = new ArrayList();
        for (int count = 1; count <= number; count++) {
            list.add(count);
        }
        return list;
    }
}
