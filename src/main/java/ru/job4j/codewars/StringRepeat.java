package ru.job4j.codewars;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        return String.valueOf(string).repeat(Math.max(0, repeat));
    }

    public static String repeatStr1(final int repeat, final String string) {
        return repeat >= 0 ? string.repeat(repeat) : "";

    }
}
