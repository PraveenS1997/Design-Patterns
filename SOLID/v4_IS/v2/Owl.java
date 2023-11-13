package SOLID.v4_IS.v2;

public class Owl extends Bird implements Fly, Dance {
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
        // owl dance logic
        System.out.println("Owl is dancing");
    }
}
