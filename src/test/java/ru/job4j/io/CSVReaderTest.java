package ru.job4j.io;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import static org.junit.Assert.*;

public class CSVReaderTest {
    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void whenFilterTwoColumnsOutToFile() throws Exception {
        String data = String.join(
                System.lineSeparator(),
                "name;age;last_name;education",
                "Tom;20;Smith;Bachelor",
                "Jack;25;Johnson;Undergraduate",
                "William;30;Brown;Secondary special");
        File file = temporaryFolder.newFile("source.csv");
        File target = temporaryFolder.newFile("target.csv");
        ArgsName argsName = ArgsName.of(new String[]{
                "-path=" + file.getAbsoluteFile(), "-delimiter=;",
                "-out=" + target.getAbsoluteFile(),
                "-filter=name,age"});
        Files.writeString(file.toPath(), data, StandardCharsets.UTF_8);
        String expected = String.join(
                System.lineSeparator(),
                "name;age",
                "Tom;20",
                "Jack;25",
                "William;30"
        ).concat(System.lineSeparator());
        CSVReader.handle(argsName);
        Assert.assertEquals(expected, Files.readString(target.toPath()));
    }

    @Test
    public void whenCSVFileAllColumnFilterAllMixColumnOutToConsole() throws Exception {
        String data = String.join(
                System.lineSeparator(),
                "name;age;last_name;education",
                "Tom;20;Smith;Bachelor",
                "Jack;25;Johnson;Undergraduate",
                "William;30;Brown;Secondary special");
        File file = temporaryFolder.newFile("source.csv");
        ArgsName argsName = ArgsName.of(new String[]{
                "-path=" + file.getAbsoluteFile(), "-delimiter=;",
                "-out=stdout", "-filter=last_name,education,name,age"});
        Files.writeString(file.toPath(), data, StandardCharsets.UTF_8);
        String expected = String.join(
                System.lineSeparator(),
                "last_name;education;name;age",
                "Smith;Bachelor;Tom;20",
                "Johnson;Undergraduate;Jack;25",
                "Brown;Secondary special;William;30"
        ).concat(System.lineSeparator());
        PrintStream standardOut = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        CSVReader.handle(argsName);
        assertEquals(expected, output.toString());
        System.setOut(standardOut);
    }

    @Test
    public void whenFilterOneColumnOutToFile() throws Exception {
        String data = String.join(
                System.lineSeparator(),
                "name;age;last_name;education",
                "Tom;20;Smith;Bachelor",
                "Jack;25;Johnson;Undergraduate",
                "William;30;Brown;Secondary special"
        );
        File file = temporaryFolder.newFile("source.csv");
        File target = temporaryFolder.newFile("target.csv");
        Files.writeString(file.toPath(), data, StandardCharsets.UTF_8);
        ArgsName argsName = ArgsName.of(new String[]{
                "-path=" + file.getAbsoluteFile(), "-delimiter=;",
                "-out=" + target.getAbsoluteFile(),
                "-filter=name"});
        String expected = String.join(
                System.lineSeparator(),
                "name",
                "Tom",
                "Jack",
                "William"
        ).concat(System.lineSeparator());
        CSVReader.handle(argsName);
        assertEquals(expected, Files.readString(target.toPath()));
    }
}