package ru.job4j.io.duplicates;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;
import java.util.Set;

import static java.nio.file.FileVisitResult.CONTINUE;

public class DuplicatesVisitor extends SimpleFileVisitor<Path> {
    Set<FileProperty> files = new HashSet<>();
    Set<FileProperty> duplicates = new HashSet<>();

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        FileProperty fileProperty = new FileProperty(attrs.size(), file.getFileName().toString());
        if (!files.add(fileProperty)) {
            duplicates.add(fileProperty);
        }
        return CONTINUE;
    }

    public Set<FileProperty> getFiles() {
        return duplicates;
    }
}