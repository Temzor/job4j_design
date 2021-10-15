package ru.job4j.codewars;


public class Barycenter {
    public static double[] barTriang(double[] x, double[] y, double[] z) {
        double a = (x[0] + y[0] + z[0]) / 3;
        double b = (x[1] + y[1] + z[1]) / 3;
        a = Double.parseDouble(String.format("%.4f", a).replace(",", "."));
        b = Double.parseDouble(String.format("%.4f", b).replace(",", "."));
        return new double[]{a, b};
    }
}
