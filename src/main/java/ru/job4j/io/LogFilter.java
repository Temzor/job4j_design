package ru.job4j.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LogFilter {
    public static List<String> filter(String file) {
        List<String> resultLine = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            resultLine = in.lines()
                    .filter(t -> t.contains(" 404 "))
                    .collect(Collectors.toList());

        }  catch (IOException e) {
            e.printStackTrace();
        }
        return resultLine;
    }

    public static void save(List<String> log, String file) {
        try (PrintWriter printWriter  = new PrintWriter(
                new BufferedOutputStream(
                        new FileOutputStream(file)
                ))) {
            log.forEach(printWriter::println);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        List<String> log = filter("log.txt");
        save(log, "404.txt");
        }
    }
