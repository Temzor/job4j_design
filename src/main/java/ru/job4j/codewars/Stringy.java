package ru.job4j.codewars;

public class Stringy {
    public static String stringy(int size) {
        StringBuilder result  = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                result.append("1");
            }  else  {
                result.append("0");
            }
        }
        System.out.println(result);
        return result.toString();
    }
}
