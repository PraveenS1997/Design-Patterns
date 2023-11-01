package Strategy.v4;

import Strategy.TransportationMode;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("Chennai", "Madurai", TransportationMode.CAR);
        googleMaps.findPath("Salem", "Bangalore", TransportationMode.BIKE);
        googleMaps.findPath("Coimbatore", "Erode", TransportationMode.WALK);
    }
}
