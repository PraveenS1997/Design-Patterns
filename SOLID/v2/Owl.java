package SOLID.v2;

public class Owl extends Bird{
    public Owl(String name, int noOfWings) {
        super(name, noOfWings);
    }

    @Override
    public void makeSound() {
        // Owl sound logic
        System.out.println("Owl is making sound");
    }

    @Override
    public void fly() {
        // Owl fly logic
        System.out.println("Owl is flying");
    }
}
