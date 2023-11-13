package SOLID.v4_IS.v1;

public class Owl extends Bird implements FlyAndDance {
    public Owl(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        // Owl sound logic
        System.out.println("Owl is making sound");
    }

    @Override
    public void fly() {
        // Owl fly logic
        System.out.println("Owl is flying");
    }

    @Override
    public void dance() {
        System.out.println("Owl is dancing");
    }
}
