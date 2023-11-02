package Strategy.v2;

import Strategy.PathCalulators.BikePathCalculator;
import Strategy.PathCalulators.CarPathCalculator;
import Strategy.PathCalulators.PathCalculator;
import Strategy.PathCalulators.WalkPathCalculator;
import Strategy.TransportationMode;

public class GoogleMaps {
    // the below method violates SRP & OCP
    public void findPath(String source, String destination, TransportationMode mode){
        if(mode == TransportationMode.CAR){
            new CarPathCalculator().findPath(source, destination);
        }
        if(mode == TransportationMode.BIKE){
            new BikePathCalculator().findPath(source, destination);
        }
        if(mode == TransportationMode.WALK){
            new WalkPathCalculator().findPath(source, destination);
        }
    }
}
