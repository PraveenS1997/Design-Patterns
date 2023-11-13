package SOLID.v5_DIP.v3_dependency_injection.Birds;

import SOLID.v3_LSP.Flyable;
import SOLID.v5_DIP.v3_dependency_injection.FlyingBehavior.FlyingBehavior;

public class Owl extends Bird implements Flyable {
    private final FlyingBehavior flyingBehavior;

    public Owl(String name, FlyingBehavior crowOwlFlyingBehavior) {
        super(name);
        flyingBehavior = crowOwlFlyingBehavior;
    }

    @Override
    public void makeSound() {
        // Owl sound logic
        System.out.println("Owl is making sound");
    }

    @Override
    public void fly() {
        // Owl fly logic
        this.flyingBehavior.fly();
    }
}
