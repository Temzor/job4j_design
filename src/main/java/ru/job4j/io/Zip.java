package ru.job4j.io;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zip {


    public static void packFiles(List<Path> sources, Path target) {
        try (ZipOutputStream zip = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(target.toFile())))) {
            for (Path source : sources) {
                zip.putNextEntry(new ZipEntry(source.toFile().getPath()));
                try (BufferedInputStream out = new BufferedInputStream(new FileInputStream(source.toFile()))) {
                    zip.write(out.readAllBytes());
                }
                System.out.println(source.toAbsolutePath() + " added to ZIP.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("ZIP SUCCESS");
    }

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            throw new IllegalArgumentException("Wrong amount of args, see example : -d=C:\\projects\\job4j_design -e=.txt -o=project.zip");
        }
        ArgsName argsName = new ArgsName();
        Search search = new Search();
        Path source = Paths.get(argsName.get("d"));
        String exclude = argsName.get("e");
        Path packName = Paths.get(argsName.get("o"));

        List<Path> filePath = search.search(source, path -> !path.toFile().getName().endsWith(exclude));
        packFiles(filePath, packName);

    }
}