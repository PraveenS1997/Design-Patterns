package SOLID.v5_DIP.v2.Birds;

import SOLID.v3_LSP.Flyable;
import SOLID.v5_DIP.v2.FlyingBehavior.CrowOwlFlyingBehavior;
import SOLID.v5_DIP.v2.FlyingBehavior.FlyingBehavior;

public class Crow extends Bird implements Flyable {
    private final FlyingBehavior flyingBehavior = new CrowOwlFlyingBehavior();
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
