package ru.job4j.io;

import java.io.File;
import java.util.Objects;

public class Dir {
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("Root folder is null. Usage java -jar dir.jar ROOT_FOLDER.");
        }
        File file = new File(args[0]);
        if (!file.exists()) {
            throw new IllegalArgumentException(String.format("Not exist %s", file.getAbsoluteFile()));
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException(String.format("Not directory %s", file.getAbsoluteFile()));
        }
        System.out.printf("size disk: %s%n", file.getTotalSpace() / 1073741824  + " GB.");
        for (File subfile : Objects.requireNonNull(file.listFiles())) {
            System.out.println("file: " + subfile.getName() + " | size = " + subfile.length() / 1024 + " Kb.");
        }
    }
}