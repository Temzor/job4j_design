package codewars;

import java.util.Arrays;

public class FindOutlier {
    public static int find(int[] integers) {
        int[] odd = Arrays.stream(integers).filter(n -> n % 2 != 0).toArray();
        int[] even = Arrays.stream(integers).filter(n -> n % 2 == 0).toArray();

        return odd.length == 1 ? odd[0] : even[0];
    }
}
