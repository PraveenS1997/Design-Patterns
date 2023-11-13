package SOLID.v5_DIP.v1.Birds;

import SOLID.v3_LSP.Flyable;
import SOLID.v5_DIP.v1.CrowOwlFlyingBehavior;

public class Crow extends Bird implements Flyable {
    private CrowOwlFlyingBehavior flyingBehavior = new CrowOwlFlyingBehavior();
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
        this.flyingBehavior.fly();
    }
}
