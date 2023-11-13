package SOLID.v3;

import SOLID.v3.Birds.Crow;
import SOLID.v3.Birds.Owl;
import SOLID.v3.Birds.Peacock;
import SOLID.v3.Birds.Penguin;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Flyable> flyableBirds = new ArrayList<>();
        flyableBirds.add(new Crow("Crow"));
        flyableBirds.add(new Owl("Owl"));
        flyableBirds.add(new Peacock("Peacock"));

        System.out.println(flyableBirds);

        Penguin penguin = new Penguin("Penguin");
        System.out.println(penguin);
    }
}
