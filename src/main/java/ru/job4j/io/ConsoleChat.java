package ru.job4j.io;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ConsoleChat {

    private final String path;
    private final String botAnswers;
    private boolean pause;
    private static final String OUT = "закончить";
    private static final String STOP = "стоп";
    private static final String CONTINUE = "продолжить";

    public ConsoleChat(String path, String botAnswers) {
        this.path = path;
        this.botAnswers = botAnswers;
    }

    public void run() {
        List<String> log = new ArrayList<>();
        List<String> robotWord = readPhrases();
        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in))) {
            String readLine = bufferedReader.readLine();
            log.add(readLine);
            while (!OUT.equals(readLine)) {
                if (!interfaceChat(readLine)) {
                    String robotAnswer = robotWord.get(new Random().nextInt(robotWord.size()));
                    System.out.println(robotAnswer);
                    log.add("bot: " + robotAnswer);
                }
                readLine = bufferedReader.readLine();
                log.add("person: " + readLine);
            }
            saveLog(log);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private List<String> readPhrases() {
        List<String> robotPhrase = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader(botAnswers, StandardCharsets.UTF_8))) {
            bufferedReader.lines().forEach(robotPhrase::add);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return robotPhrase;
    }

    private void saveLog(List<String> log) {
        try (PrintWriter printWriter = new PrintWriter(
                new FileWriter(path, StandardCharsets.UTF_8, true))) {
            log.forEach(printWriter::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean interfaceChat(String line) {
        if (STOP.equals(line)) {
            pause = true;
        }
        if (CONTINUE.equals(line)) {
            pause = false;
        }
        return pause;
    }

    public static void main(String[] args) {
        ConsoleChat cc = new ConsoleChat("./data/stupidDialogue/chat.log", "./data/stupidDialogue/answers.txt");
        cc.run();
    }
}