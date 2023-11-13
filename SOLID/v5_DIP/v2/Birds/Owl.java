package SOLID.v5_DIP.v2.Birds;

import SOLID.v3_LSP.Flyable;
import SOLID.v5_DIP.v2.FlyingBehavior.CrowOwlFlyingBehavior;
import SOLID.v5_DIP.v2.FlyingBehavior.FlyingBehavior;

public class Owl extends Bird implements Flyable {
    private FlyingBehavior flyingBehavior = new CrowOwlFlyingBehavior();

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
        this.flyingBehavior.fly();
    }
}
