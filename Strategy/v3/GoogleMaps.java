package Strategy.v3;

import Strategy.TransportationMode;

public class GoogleMaps {
    public void findRoute(String source, String destination, TransportationMode mode){
        RouteCalculatorFactory.getRouteCalculatorByMode(mode).getRoute(source, destination);
    }
}
