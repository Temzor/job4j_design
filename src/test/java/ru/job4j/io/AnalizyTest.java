package ru.job4j.io;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AnalizyTest {
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void temporaryTest1() throws IOException {
        File source = folder.newFile("source1.txt");
        File target = folder.newFile("target1.txt");
        try (PrintWriter out = new PrintWriter(source)) {
            out.println("200 10:56:01");
            out.println("500 10:57:01");
            out.println("400 10:58:01");
            out.println("500 10:59:01");
            out.println("400 11:01:02");
            out.println("200 11:02:02");
        }
        Analyze analyze = new Analyze();
        analyze.unavailable(source.getAbsolutePath(), target.getAbsolutePath());
        StringBuilder result = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new FileReader(target))) {
            in.lines().forEach(result::append);
        }
        assertThat(result.toString(), is("10:57:01;11:02:02;"));
    }

    @Test
    public void temporaryTest2() throws IOException {
        File source = folder.newFile("source2.txt");
        File target = folder.newFile("target2.txt");
        try (PrintWriter out = new PrintWriter(source)) {
            out.println("200 10:56:01");
            out.println("500 10:57:01");
            out.println("400 10:58:01");
            out.println("200 10:59:01");
            out.println("500 11:01:02");
            out.println("200 11:02:02");
        }
        Analyze analyze = new Analyze();
        analyze.unavailable(source.getAbsolutePath(), target.getAbsolutePath());
        StringBuilder result = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new FileReader(target))) {
            in.lines().forEach(result::append);
        }
        assertThat(result.toString(), is("10:57:01;10:59:01;11:01:02;11:02:02;"));
    }

    @Test
    public void whenLogFile1() {
        String source = "source1.csv";
        String target = "target1.txt";
        Analyze analyze = new Analyze();
        analyze.unavailable(source, target);
    }

    @Test
    public void whenLogFile2() {
        String source = "source2.csv";
        String target = "target2.txt";
        Analyze analyze = new Analyze();
        analyze.unavailable(source, target);
    }
}