package SOLID.v5_DIP.v1;

import SOLID.v5_DIP.v1.Birds.Crow;
import SOLID.v5_DIP.v1.Birds.Owl;

public class Client {
    public static void main(String[] args) {
        Crow crow = new Crow("Crow");
        Owl owl = new Owl("Owl");

        crow.fly();
        owl.fly();
    }
}
