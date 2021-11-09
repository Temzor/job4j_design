package ru.job4j.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Predicate;

public class Search {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            throw new IllegalArgumentException("No search arguments entered. Usage java -jar search.jar ROOT_FOLDER EXTENSION.");
        }
        Path start = Paths.get(args[0]);
        String extension = args[1];
        if (!Files.isDirectory(start)) {
            throw new NoSuchFileException("Entered such ROOT_FOLDER exist.");
        }
        search(start, p -> p.toFile().getName().endsWith(extension)).forEach(System.out::println);
    }

    public static List<Path> search(Path root, Predicate<Path> condition) throws IOException {
        SearchFiles searcher = new SearchFiles(condition);
        Files.walkFileTree(root, searcher);
        return searcher.getPaths();
    }
}