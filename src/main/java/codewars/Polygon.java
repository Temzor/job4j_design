package codewars;

public class Polygon {
    int sides;
    int sideLength;

    public Polygon(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double circleDiameter() {
        double angleInRadian =  Math.PI / sides;
        return sideLength / Math.tan(angleInRadian);
    }
}
