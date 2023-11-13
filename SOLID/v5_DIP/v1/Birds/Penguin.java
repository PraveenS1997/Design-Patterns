package SOLID.v5_DIP.v1.Birds;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        // penguin sound logic
        System.out.println("Penguin is making sound");
    }
}
