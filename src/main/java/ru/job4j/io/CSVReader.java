package ru.job4j.io;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;


public class CSVReader {
    public static void handle(ArgsName argsName) {
        int count = 0;
        StringBuilder result = new StringBuilder();
        try (var scanner = new Scanner(new FileReader(ArgsName.getValues().get("path")))) {
            List<Integer> indexList = new ArrayList<>();
            String[] filters = ArgsName.getValues().get("filter").split(",");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] strings = line.split(ArgsName.getValues().get("delimiter"));
                List<String> stringList = Arrays.asList(strings);
                for (String filter : filters) {
                    if (stringList.contains(filter)) {
                        indexList.add(stringList.indexOf(filter));
                    }
                }
                for (Integer index : indexList) {
                    result.append(stringList.get(index));
                    count++;
                    if (count < indexList.size()) {
                        result.append(";");
                    }
                }
                if (scanner.hasNext()) {
                    result.append(System.lineSeparator());
                    count = 0;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if ("stdout".equals(ArgsName.getValues().get("out"))) {
            System.out.println(result);
        } else {
            outputResult(result);
        }
    }


    public static void checkFileAddress(Map<String, String> values) {
        File file = new File(values.get("path"));
        if (!file.exists()) {
            throw new IllegalArgumentException(String.format("The file does not exist %s", file.getAbsoluteFile()));
        }
    }

    public static void validationTokenKeys(Map<String, String> values) {
        if (values.size() != 4 || !values.containsKey("path") || !values.containsKey("delimiter")
                || !values.containsKey("out") || !values.containsKey("filter")) {
            throw new IllegalArgumentException("Incorrect entering parameters to run. See example: -path=file.csv -delimiter=\";\"  -out=stdout -filter=name,age");
        }
    }

    private static void outputResult(StringBuilder result) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(ArgsName.getValues().get("out"),
                Charset.forName("WINDOWS-1251"), true))) {
            printWriter.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        ArgsName argsName = new ArgsName();
        Map<String, String> mapValues = ArgsName.getValues();
        validationTokenKeys(mapValues);
        checkFileAddress(mapValues);
        handle(argsName);
    }
}
