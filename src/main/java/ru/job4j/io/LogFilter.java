package ru.job4j.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LogFilter {
    public static List<String> filter(String file) {
        List<String> result = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader(file));
             PrintWriter out = new PrintWriter(new BufferedOutputStream(
                     new FileOutputStream("resultLogFilter.txt")))) {
           result = in.lines()
                   .filter(t -> t.split(" ")[t.split(" ").length - 2].equals("404"))
                   .collect(Collectors.toList());
            for (String s : result) {
                out.write(s);
                out.write(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> log = filter("log.txt");
        for (String s : log) {
            System.out.println(s);
        }
    }
}