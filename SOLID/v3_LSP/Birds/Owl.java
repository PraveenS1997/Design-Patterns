package SOLID.v3_LSP.Birds;

import SOLID.v3_LSP.Flyable;

public class Owl extends Bird implements Flyable {
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
}
