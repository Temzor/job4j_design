package ru.codewars.eightkyu;

import java.util.List;


public class MixedSum {
    public int sum(List<?> mixed) {
       return mixed
               .stream()
               .mapToInt(o -> Integer.parseInt(o.toString()))
               .sum();
    }
}
