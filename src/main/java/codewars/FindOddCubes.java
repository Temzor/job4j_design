package codewars;

public class FindOddCubes {
    public static int cubeOdd(int[] arr) {
        int result = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                result += Math.pow(i, 3);
            }
        }
        return result;
    }
}