package itvdn.oop.abs;

public class Penguin extends Bird {
    @Override
    public void move() {
        System.out.println("Swim.");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep on earth");
    }
}
