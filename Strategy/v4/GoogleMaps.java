package Strategy.v4;

import Strategy.TransportationMode;

public class GoogleMaps {
    public void findRoute(String source, String destination, TransportationMode mode){
        RouteCalculatorFactory.getRouteCalculatorByMode(mode).findRoute(source, destination);
    }
}
