package codewars;


public class SquareSum {
    public static int squareSum(int[] n) {
       int result = 0;
        for (int j : n) {
            result += j * j;
        }
        return result;
    }
}
