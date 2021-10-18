package codewars;

public class ASum {
    public static long findNb(long m) {
        int i;
        for (i = 1; m > 0; i++) {
            m -= (long) Math.pow(i, 3);
        }
        return m == 0 ? i - 1 : -1;
    }
}
