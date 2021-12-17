package finder;

import java.util.HashMap;
import java.util.Map;

public class ArgsName {

    private final Map<String, String> values = new HashMap<>();

    public String get(String key) {
        return values.get(key);
    }

    private void parse(String[] args) {
        if (validatorLengthArray(args)) {
            for (String arg : args) {
                if (validatorValueArray(arg)) {
                    String[] pair = arg.split("=");
                    values.put(pair[0].substring(1), pair[1]);
                }
            }
        }
    }

    public static ArgsName of(String[] args) {
        ArgsName names = new ArgsName();
        names.parse(args);
        return names;
    }

    public static boolean validatorLengthArray(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("Parameter is not exist, no found key to run, example /-Xmx=512/, /-encoding=UTF-8./");
        }
        return true;
    }

    public static boolean validatorValueArray(String arg) {
        if (!arg.startsWith("-") || !arg.contains("=") || arg.startsWith("=") || arg.endsWith("=") || arg.startsWith("-=")) {
            throw new IllegalArgumentException("Incorrect parameter " + arg + ". Usage -PARAMETER=VALUE.");
        }
        return true;
    }
}