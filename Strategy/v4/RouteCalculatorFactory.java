package Strategy.v4;

import Strategy.RouteCalulators.BikeRouteCalculator;
import Strategy.RouteCalulators.CarRouteCalculator;
import Strategy.RouteCalulators.RouteCalculator;
import Strategy.RouteCalulators.WalkRouteCalculator;
import Strategy.TransportationMode;

// practical factory implementation to get the correct
// RouteCalculator objects from given Transportation mode
public class RouteCalculatorFactory {
    // the issue in the below code is, everytime this method is called
    // a new instance of RouteCalculator is created & returned
    // we can use Singleton pattern to avoid creating multiple objects
    // since we don't need to pass any arguments to Car, Bike, Walk
    // RouteCalculators when creating objects, so we can use
    // eager loading Singleton approach
    private static RouteCalculator carRouteCalculator = new CarRouteCalculator();
    private static RouteCalculator bikeRouteCalculator = new BikeRouteCalculator();
    private static RouteCalculator walkRouteCalculator = new WalkRouteCalculator();

    public static RouteCalculator getRouteCalculatorByMode(TransportationMode mode){
        return switch (mode){
            case CAR -> carRouteCalculator;
            case BIKE -> bikeRouteCalculator;
            case WALK -> walkRouteCalculator;
        };
    }
}
