package itvdn.oop.abs;

public class Swallow extends Bird {
    @Override
    public void move() {
        System.out.println("Fly.");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep on earth");
    }
}
