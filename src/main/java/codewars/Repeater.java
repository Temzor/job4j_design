package codewars;

public class Repeater {
    public static String repeat(String string, long n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(string);
        }
        return result.toString();
    }
}
