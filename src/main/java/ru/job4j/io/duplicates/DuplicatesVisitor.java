package ru.job4j.io.duplicates;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicatesVisitor extends SimpleFileVisitor<Path> {
    private final Map<FileProperty, Path> files = new HashMap<>();
    private final List<FileProperty> duplicates = new ArrayList<>();

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        FileProperty fileProperty = new FileProperty(attrs.size(), file.toFile().getAbsolutePath());
        if (!files.containsKey(fileProperty)) {
            duplicates.add(fileProperty);
        } else {
            files.put(fileProperty, file);
        }
        return FileVisitResult.CONTINUE;
    }

    public List<FileProperty> getFiles() {
        return duplicates;
    }
}