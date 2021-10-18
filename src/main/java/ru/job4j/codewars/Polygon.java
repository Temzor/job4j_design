package ru.job4j.codewars;

public class Polygon {
    int sides;
    int sideLength;

    public Polygon(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double circleDiameter() {
        double angle_in_radian =  Math.PI / sides;
        return sideLength / Math.tan(angle_in_radian);
    }
}
