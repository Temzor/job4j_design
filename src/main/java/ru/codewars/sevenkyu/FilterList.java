package ru.codewars.sevenkyu;

import java.util.*;
import java.util.stream.Collectors;

public class FilterList {
    public static List filterList(final List list) {
        return (List) list.stream()
                .filter(x -> x instanceof Integer)
                .collect(Collectors.toList());
    }
 }
