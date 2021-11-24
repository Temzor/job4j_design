package codewars;

public class RowWeights {
    public static int[] rowWeights(int[] weights) {
        int first = 0;
        int second = 0;

        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                first += weights[i];
            } else {
                second += weights[i];
            }
        }
        return new int[]{first, second};
    }
}
