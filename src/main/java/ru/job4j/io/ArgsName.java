package ru.job4j.io;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ArgsName {

    private final Map<String, String> values = new HashMap<>();

    public String get(String key) {
        if (!values.containsKey(key)) {
            throw new IllegalArgumentException("Parameter " + key + " is not exist");
        }
        return values.get(key);
    }

    private void parse(String[] args) {
        for (String arg : args) {
            String[] pair = arg.split("=");
            if (pair.length != 2 || pair[0].length() < 2 || pair[0].charAt(0) != '-') {
                throw new IllegalArgumentException("Incorrect parameter " + pair[0] + ". Usage -PARAMETER=VALUE.");
            }
            values.put(pair[0].substring(1), pair[1]);
        }
    }

    public static ArgsName of(String[] args) {
        ArgsName names = new ArgsName();
        names.parse(args);
        return names;
    }

    public Map<String, String> getValues() {
        return values;
    }

    public static void main(String[] args) {
        ArgsName jvm = ArgsName.of(new String[] {"-Xmx=512", "-encoding=UTF-8"});
        System.out.println(jvm.get("Xmx"));

        ArgsName zip = ArgsName.of(new String[] {"-out=project.zip", "-encoding=UTF-8"});
        System.out.println(zip.get("out"));
    }
}