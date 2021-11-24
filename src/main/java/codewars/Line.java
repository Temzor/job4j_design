package codewars;

public class Line {
    public static String tickets(int[] peopleInLine) {
        int d25 = 0;
        int d50 = 0;
        for (int j : peopleInLine) {
            if (j == 25) {
                d25++;
            }
            if (j == 50) {
                d25--;
                d50++;
            }
            if (j == 100) {
                if (d50 > 0) {
                    d50--;
                    d25--;
                } else {
                    d25 -= 3;
                }
            }
            if (d25 < 0) {
                return "NO";
            }
        }
        return "YES";
    }
}
