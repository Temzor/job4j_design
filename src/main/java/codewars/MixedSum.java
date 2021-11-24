package codewars;

import java.util.Arrays;
import java.util.List;


public class MixedSum {
    public int sum(List<?> mixed) {
       return mixed
               .stream()
               .mapToInt(o -> Integer.parseInt(o.toString()))
               .sum();
    }
}
