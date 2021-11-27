package itvdn.oop.abs;

public class Strauss extends Bird {
    @Override
    public void move() {
        System.out.println("Run.");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep on earth");
    }
}
