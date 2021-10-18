package codewars;

public class CloseCompare {
    public static int closeCompare(double a, double b) {
        return Double.compare(a, b);
    }

    public static int closeCompare(double a, double b, double margin) {
        return margin >= Math.abs(a - b) ? 0 : closeCompare(a, b); // TOD
    }
}
