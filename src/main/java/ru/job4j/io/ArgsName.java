package ru.job4j.io;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class ArgsName {

    private static final Map<String, String> VALUES = new HashMap<>();


    public String get(String key) {
        if (!VALUES.containsKey(key) || key == null) {
            throw new IllegalArgumentException("Parameter " + key + " is not exist");
        }
        return VALUES.get(key);
    }

    public static Map<String, String> getValues() {
        return VALUES;
    }

    private void parse(String @NotNull [] args) {
        for (String arg : args) {
            String[] pair = arg.split("=");
            if (pair.length != 2 || pair[0].length() < 2 || pair[0].charAt(0) != '-') {
                throw new IllegalArgumentException("Incorrect parameter " + pair[0] + ". Usage -PARAMETER=VALUE.");
            }
            VALUES.put(pair[0].substring(1), pair[1]);
        }
    }

    public static ArgsName of(String[] args) {
        ArgsName names = new ArgsName();
        names.parse(args);
        return names;
    }

    public static void main(String[] args) {
        ArgsName jvm = ArgsName.of(new String[] {"-Xmx=512", "-encoding=UTF-8"});
        System.out.println(jvm.get("Xmx"));

        ArgsName zip = ArgsName.of(new String[] {"-out=project.zip", "-encoding=UTF-8"});
        System.out.println(zip.get("out"));
    }
}