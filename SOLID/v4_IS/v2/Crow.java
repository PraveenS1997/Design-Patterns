package SOLID.v4_IS.v2;

public class Crow extends Bird implements Fly, Dance {
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
