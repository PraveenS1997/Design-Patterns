package SOLID.v1_SRP;

public class Bird {
    private String name;
    private int noOfWings;
    private String type;

    public void makeSound(){
        switch (this.type){
            case "Peacock":
                // logic for Peacock
                System.out.println("Peacock is making sound");
                break;
            case "Crow":
                // logic for Crow
                System.out.println("Crow is making sound");
                break;
            case "Owl":
                // logic for Owl
                System.out.println("Owl is making sound");
                break;
        }
    }
}
