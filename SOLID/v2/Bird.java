package SOLID.v2;

public abstract class Bird {
    public String name;
    public int noOfWings;

    public Bird(String name, int noOfWings){
        this.name = name;
        this.noOfWings = noOfWings;
    }

    public void makeSound(){
        // default logic for all the birds make sound
        System.out.println("Bird is making sound");
    }

    public void fly(){
        // default logic for all the birds fly method
        System.out.println("Bird is flying");
    }
}
