package SOLID.v2_OCP;

public class Crow extends Bird{
    public Crow(String name, int noOfWings) {
        super(name, noOfWings);
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
