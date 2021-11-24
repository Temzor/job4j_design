package codewars;

import java.util.List;
import java.util.stream.Collectors;

public class SortList<S> {
    public static List<String> sort(List<String> textbooks) {
       return textbooks
               .stream()
               .sorted()
               .collect(Collectors.toList());
    }
}
