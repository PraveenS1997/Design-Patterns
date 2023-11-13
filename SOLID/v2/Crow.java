package SOLID.v2;

public class Crow extends Bird{
    public Crow(String name, int noOfWings) {
        super(name, noOfWings);
    }

    @Override
    public void makeSound() {
        // Crow make sound logic
        System.out.println("Crow is making sound");
    }
}
