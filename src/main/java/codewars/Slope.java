package codewars;

public class Slope {
    public String slope(int[] points) {
        if (points[0] - points[2] == 0) {
            return "undefined";
        } else if (points[1] - points[3] == 0) {
            return "0";
        } else {
            return String.valueOf((points[3] - points[1]) / (points[2] - points[0]));
        }

    }
}
