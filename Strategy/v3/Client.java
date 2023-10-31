package Strategy.v3;

import Strategy.TransportationMode;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findRoute("Chennai", "Madurai", TransportationMode.CAR);
        googleMaps.findRoute("Salem", "Trichy", TransportationMode.BIKE);
        googleMaps.findRoute("Attur", "Yercaud", TransportationMode.WALK);
    }
}
