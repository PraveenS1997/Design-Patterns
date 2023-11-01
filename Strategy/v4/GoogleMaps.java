package Strategy.v4;

import Strategy.TransportationMode;

public class GoogleMaps {
    public void findPath(String source, String destination, TransportationMode mode){
        RouteCalculatorFactory.getRouteCalculatorByMode(mode).findPath(source, destination);
    }
}
