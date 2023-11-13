package SOLID.v3.Birds;

import SOLID.v3.Birds.Bird;
import SOLID.v3.Flyable;

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
