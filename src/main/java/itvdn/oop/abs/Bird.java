package itvdn.oop.abs;

public abstract class Bird {
    public abstract void move();
    public abstract void sleep();
    public void eat() {
        System.out.println("I can eat.");
    }
}
