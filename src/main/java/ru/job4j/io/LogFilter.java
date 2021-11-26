package ru.job4j.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LogFilter {
    public static List<String> filter(String file) {
        List<String> resultLine = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            resultLine = in.lines()
                    .filter(t -> t.split(" ")[t.split(" ").length - 2].equals("404"))
                    .collect(Collectors.toList());

        }  catch (IOException e) {
            e.printStackTrace();
        }
        return resultLine;
    }

    public static void main(String[] args) {
        List<String> log = filter("log.txt");
        System.out.println(log);
        for (String s : log) {
            System.out.println(s);
        }
    }
}