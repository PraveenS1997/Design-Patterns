package SOLID.v5_DIP.v3_dependency_injection.Birds;

import SOLID.v3_LSP.Flyable;

public class Peacock extends Bird implements Flyable {
    public Peacock(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        // peacock sound logic
        System.out.println("Peacock is making sound");
    }

    @Override
    public void fly() {
        // peacock fly logic
        System.out.println("Peacock is flying");
    }
}
