package SOLID.v2;

public class Peacock extends Bird{
    public Peacock(String name, int noOfWings) {
        super(name, noOfWings);
    }

    @Override
    public void makeSound() {
        // peacock sound logic
        System.out.println("Peacock is making sound");
    }

    @Override
    public void fly() {
        // peacock fly logic
        System.out.println("Peacock is flying");
    }
}
