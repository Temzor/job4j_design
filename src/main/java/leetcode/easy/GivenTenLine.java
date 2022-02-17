package leetcode.easy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GivenTenLine {

    private final String path;
    private final Map<String, String> values = new HashMap<>();

    public GivenTenLine(final String path) {
        this.path = path;
    }

    public void load() {
        try (BufferedReader reader = new BufferedReader(
                new FileReader(path))) {
            if ()
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
