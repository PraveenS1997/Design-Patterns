package SOLID.v5_DIP.v3_dependency_injection.Birds;

public abstract class Bird {
    public String name;
    public Bird(String name){
        this.name = name;
    }

    public void makeSound(){
        // default logic for all the birds make sound
        System.out.println("Bird is making sound");
    }

    @Override
    public String toString() {
        return "Bird: " + this.name;
    }
}
