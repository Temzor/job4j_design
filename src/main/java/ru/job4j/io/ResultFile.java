package ru.job4j.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ResultFile {
    public static void main(String[] args) {
        try (PrintWriter out = new PrintWriter(
                new BufferedOutputStream(
                        new FileOutputStream("result.txt")
                ))) {
            out.println("Hello, world!");
            out.printf("%s%n", "Some string");
            out.printf("%d%n", 10);
            out.printf("%f%n", 1.5f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}