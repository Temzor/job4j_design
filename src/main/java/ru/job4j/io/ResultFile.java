package ru.job4j.io;

import java.io.*;

public class ResultFile {
    public static void main(String[] args) {
        try (FileOutputStream out = new FileOutputStream("resultMultiple.txt")) {
            for (int row = 1; row <= 10; row++) {
                for (int cell = 1; cell <= 10; cell++) {
                    out.write(((row * cell + " || ").getBytes()));
                }
                out.write(System.lineSeparator().getBytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}