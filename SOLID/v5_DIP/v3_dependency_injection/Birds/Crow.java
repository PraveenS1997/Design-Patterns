package SOLID.v5_DIP.v3_dependency_injection.Birds;

import SOLID.v3_LSP.Flyable;
import SOLID.v5_DIP.v3_dependency_injection.FlyingBehavior.CrowOwlFlyingBehavior;
import SOLID.v5_DIP.v3_dependency_injection.FlyingBehavior.FlyingBehavior;

public class Crow extends Bird implements Flyable {
    private final FlyingBehavior flyingBehavior;
    public Crow(String name, FlyingBehavior crowOwlFlyingBehavior) {
        super(name);
        flyingBehavior = crowOwlFlyingBehavior;
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
