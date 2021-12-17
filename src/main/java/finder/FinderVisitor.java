package finder;

import ru.job4j.io.duplicates.FileProperty;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class FinderVisitor extends SimpleFileVisitor<Path> {
    private final Map<FinderProperty, Path> files = new HashMap<>();
    private final List<FinderProperty> duplicates = new ArrayList<>();

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        FinderProperty finderProperty = new FinderProperty(attrs.size(), file.toFile().getAbsolutePath());
        if (!files.containsKey(finderProperty)) {
            duplicates.add(finderProperty);
        } else {
            files.put(finderProperty, file);
        }
        return FileVisitResult.CONTINUE;
    }

    public List<FinderProperty> getFiles() {
        return duplicates;
    }
}
