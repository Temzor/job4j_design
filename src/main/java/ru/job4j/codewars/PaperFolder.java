package ru.job4j.codewars;

public class PaperFolder {
    public static Long fold(Double distance) {
        System.out.println(distance);
        if (distance >= 0.0001) {
            return (long) Math.ceil(Math.log(distance * 10000) / Math.log(2));
        }
        return distance >= 0 ? 0L : null;
    }
}
