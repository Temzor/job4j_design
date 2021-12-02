package ru.job4j.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Predicate;

public class Search {

    public List<Path> search(Path root, Predicate<Path> condition) throws IOException {
        SearchFiles searcher = new SearchFiles(condition);
        Files.walkFileTree(root, searcher);
        return searcher.getPaths();
    }

    private void validate(String[] args) {
        if (args.length < 2) {
            throw new IllegalArgumentException("Root folder or file extension is empty. "
                    + "Usage java -jar dir.jar ROOT_FOLDER FILE_EXTENSION.");
        }
        Path directory = Path.of(args[0]);
        if (!directory.toFile().isDirectory() && !directory.toFile().exists()) {
            throw new IllegalArgumentException("Directory is not found. "
                    + "Specify an existing directory.");
        }
    }

    public static void main(String[] args) throws IOException {
        Search search = new Search();
        search.validate(args);
        search.search(Paths.get(args[0]), p -> p.toFile().getName().endsWith(args[1])).forEach(System.out::println);
    }
}