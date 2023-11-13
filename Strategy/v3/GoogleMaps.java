package Strategy.v3;

import Strategy.TransportationMode;

public class GoogleMaps {
    public void findPath(String source, String destination, TransportationMode mode){
        PathCalculatorFactory.getPathCalculatorByMode(mode).findPath(source, destination);
    }
}
