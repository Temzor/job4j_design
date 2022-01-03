package ru.job4j.io.searcher;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Searcher {
    private String regex;

    public List<Path> search(ArgsName argsName) throws IOException {
        SearchFiles searcher = new SearchFiles(p -> p.toFile().getName().matches(regex));
        Files.walkFileTree(Path.of(argsName.get("d")), searcher);
        return searcher.getPaths();
    }

    public void save(String outputFile, List<Path> files) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(outputFile, StandardCharsets.UTF_8, true))) {
            for (Path file : files) {
                System.out.println(file);
                pw.println(file);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArgsName parsingArgs(String[] args) {
        if (args.length < 4) {
            throw new IllegalArgumentException("Invalid parameters. "
                    + "Usage java -jar find.jar -d=START_DIRECTORY -n=FILE_NAME (optional MASK or REGEX) "
                    + "-t=TYPE_OF_SEARCH (available: name, mask and regex) -o=OUTPUT_FILE_NAME");
        }
        ArgsName argsName = ArgsName.of(args);
        if (!Path.of(argsName.get("d")).toFile().isDirectory()) {
            throw new IllegalArgumentException("Directory \"" + argsName.get("d") + "\" is not found. "
                    + "Specify an existing directory.");
        }
        switch (argsName.get("t")) {
            case "mask", "regex", "name" -> addRegex(argsName.get("t"), argsName.get("n"));
            default -> throw new IllegalArgumentException("Invalid type of search.  "
                    + "Use -o=name to search by name or -o=mask and -o=regex");
        }
        return argsName;
    }

    private void addRegex(String type, String regex) {
        if ("regex".equals(type) || "name".equals(type)) {
            this.regex = regex;
        } else {
            this.regex = regex
                    .replace("?", ".?")
                    .replace("*", ".*?");
        }
    }

    public static void main(String[] args) throws IOException {
        Searcher searcher = new Searcher();
        ArgsName argsName = searcher.parsingArgs(args);
        List<Path> files = searcher.search(argsName);
        searcher.save(argsName.get("o"), files);
    }
}