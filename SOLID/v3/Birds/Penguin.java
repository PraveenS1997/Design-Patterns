package SOLID.v3.Birds;

import SOLID.v3.Birds.Bird;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        // penguin sound logic
        System.out.println("Penguin is making sound");
    }
}
