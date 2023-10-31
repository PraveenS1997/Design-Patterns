package Strategy.v2;

import Strategy.RouteCalulators.BikeRouteCalculator;
import Strategy.RouteCalulators.CarRouteCalculator;
import Strategy.RouteCalulators.RouteCalculator;
import Strategy.RouteCalulators.WalkRouteCalculator;
import Strategy.TransportationMode;

public class GoogleMaps {
    // the below method violates SRP & OCP
    public void findRoute(String source, String destination, TransportationMode mode){
        if(mode == TransportationMode.CAR){
            RouteCalculator carRouteCalculator = new CarRouteCalculator();
            carRouteCalculator.getRoute(source, destination);
        }
        if(mode == TransportationMode.BIKE){
            RouteCalculator bikeRouteCalculator = new BikeRouteCalculator();
            bikeRouteCalculator.getRoute(source, destination);
        }
        if(mode == TransportationMode.WALK){
            RouteCalculator walkRouteCalculator = new WalkRouteCalculator();
            walkRouteCalculator.getRoute(source, destination);
        }
    }
}
