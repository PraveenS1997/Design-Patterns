package Strategy.v3;

import Strategy.RouteCalulators.BikeRouteCalculator;
import Strategy.RouteCalulators.CarRouteCalculator;
import Strategy.RouteCalulators.RouteCalculator;
import Strategy.RouteCalulators.WalkRouteCalculator;
import Strategy.TransportationMode;

// practical factory implementation to get the correct
// RouteCalculator objects from given Transportation mode
public class RouteCalculatorFactory {
    public static RouteCalculator getRouteCalculatorByMode(TransportationMode mode){
        return switch (mode){
            case CAR -> new CarRouteCalculator();
            case BIKE -> new BikeRouteCalculator();
            case WALK -> new WalkRouteCalculator();
        };
    }
}
