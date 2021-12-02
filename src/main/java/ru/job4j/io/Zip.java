package ru.job4j.io;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zip {

    public static void packFiles(List<Path> source, Path target) {
        try (ZipOutputStream zip = new ZipOutputStream(
                new BufferedOutputStream(new FileOutputStream(target.toFile())))) {
            for (Path path : source) {
                zip.putNextEntry(new ZipEntry(path.toFile().getPath()));
                try (BufferedInputStream out = new BufferedInputStream(new FileInputStream(path.toFile()))) {
                    zip.write(out.readAllBytes());
                }
                System.out.println(path.toAbsolutePath() + " added to ZIP.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("ZIP SUCCESS");
    }

    public void validArgs(ArgsName argsName) {
        argsName.get("d");
        argsName.get("e");
        argsName.get("o");
        if (!Path.of(argsName.get("d")).toFile().isDirectory()) {
            throw new IllegalArgumentException(argsName.get("d") + "\" directory is not found");
        }
    }

    public static void main(String[] args) throws IOException {
        ArgsName argsName = ArgsName.of(args);
        Search search = new Search();
        Zip zip = new Zip();
        zip.validArgs(argsName);
        Path source = Paths.get(argsName.get("d"));
        String exclude = argsName.get("e");
        Path packName = Paths.get(argsName.get("o"));

        List<Path> listFiles = search.search(source, p -> p.toFile().isFile());
        List<Path> filterList = listFiles.stream().filter(p -> !p.toFile().getName().endsWith(exclude)).collect(Collectors.toList());

        packFiles(filterList, packName);
    }
}