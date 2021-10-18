package codewars;

public class Geometry {
    public static double squareArea(double a) {
        double s = Math.pow(2 * a / Math.PI, 2);
        return Math.round(s * 100) / 100.0;
    }
}
