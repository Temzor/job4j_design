package ru.job4j.io;

import org.junit.Test;

public class AnalyzeTest {

    @Test
    public void whenLogFile1() {
        String source = "source1.csv";
        String target = "targetResult1.txt";
        Analyze analyze = new Analyze();
        analyze.unavailable(source, target);
    }

    @Test
    public void whenLogFile2() {
        String source = "source2.csv";
        String target = "targetResult2.txt";
        Analyze analyze = new Analyze();
        analyze.unavailable(source, target);
    }
}