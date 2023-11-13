package SOLID.v3.Birds;

import SOLID.v3.Flyable;

public class Crow extends Bird implements Flyable {
    public Crow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        // Crow make sound logic
        System.out.println("Crow is making sound");
    }

    @Override
    public void fly() {
        // Crow fly logic
        System.out.println("Crow is flying");
    }
}
