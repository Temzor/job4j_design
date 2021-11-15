package ru.job4j.io;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zip {

    public void packFile(List<Path> source, File target) {
        try (ZipOutputStream zip = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(target)))) {
            for (Path file : source) {
                zip.putNextEntry(new ZipEntry(file.toFile().getPath()));
                try (BufferedInputStream out = new BufferedInputStream(new FileInputStream(file.toFile()))) {
                    zip.write(out.readAllBytes());
                }
                System.out.println(file.toAbsolutePath() + " added");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("ZIP SUCCESS");
    }

    public void validator(ArgsName argsName) {
        argsName.get("d");
        argsName.get("e");
        argsName.get("o");
        if (!Path.of(argsName.get("d")).toFile().isDirectory()) {
            throw new IllegalArgumentException("Directory \"" + argsName.get("d") + "\" is not found");
        }
    }

    public static void main(String[] args) throws IOException {
        ArgsName argsName = ArgsName.of(args);
        Zip zip = new Zip();
        zip.validator(argsName);
        Path sours = Paths.get(argsName.get("d"));
        String exclude = argsName.get("e");
        File target = new File(argsName.get("o"));
        List<Path> listFiles = Search.search(sours, p -> p.toFile().isFile());
        List<Path> filterList = listFiles.stream().filter(p -> !p.toFile().getName().endsWith(exclude)).collect(Collectors.toList());
        zip.packFile(filterList, target);
    }
}