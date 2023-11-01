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
            PathCalculator carPathCalculator = new CarPathCalculator();
            carPathCalculator.findPath(source, destination);
        }
        if(mode == TransportationMode.BIKE){
            PathCalculator bikePathCalculator = new BikePathCalculator();
            bikePathCalculator.findPath(source, destination);
        }
        if(mode == TransportationMode.WALK){
            PathCalculator walkPathCalculator = new WalkPathCalculator();
            walkPathCalculator.findPath(source, destination);
        }
    }
}
