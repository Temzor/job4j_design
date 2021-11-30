package ru.job4j.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Search {
    public static void main(String[] args) throws IOException {
        Path start = Paths.get(".");
        Files.walkFileTree(start, new PrintFiles());
    }
}