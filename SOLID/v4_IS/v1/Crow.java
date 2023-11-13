package SOLID.v4_IS.v1;

public class Crow extends Bird implements FlyAndDance {
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

    @Override
    public void dance() {
        System.out.println("Crow is dancing");
    }
}
