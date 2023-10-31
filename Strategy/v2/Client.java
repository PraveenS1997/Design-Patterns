package Strategy.v2;

import Strategy.TransportationMode;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findRoute("Chennai", "Madurai", TransportationMode.CAR);
        googleMaps.findRoute("Salem", "Bangalore", TransportationMode.BIKE);
        googleMaps.findRoute("Coimbatore", "Erode", TransportationMode.WALK);
    }
}
