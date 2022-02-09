package leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PascalTriangleTest {
    @Test
    public void testOne() {
        PascalTriangle pascalTriangle = new PascalTriangle();
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>();
        row.add(1);
        result.add(new ArrayList<>(row));
        Arrays.equals(new List[]{result}, new List[]{pascalTriangle.generate(1)});
    }
}