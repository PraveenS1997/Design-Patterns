package Strategy.v4;

import Strategy.PathCalulators.BikePathCalculator;
import Strategy.PathCalulators.CarPathCalculator;
import Strategy.PathCalulators.PathCalculator;
import Strategy.PathCalulators.WalkPathCalculator;
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
    private static final PathCalculator CAR_PATH_CALCULATOR = new CarPathCalculator();
    private static final PathCalculator BIKE_PATH_CALCULATOR = new BikePathCalculator();
    private static final PathCalculator WALK_PATH_CALCULATOR = new WalkPathCalculator();

    public static PathCalculator getRouteCalculatorByMode(TransportationMode mode){
        return switch (mode){
            case CAR -> CAR_PATH_CALCULATOR;
            case BIKE -> BIKE_PATH_CALCULATOR;
            case WALK -> WALK_PATH_CALCULATOR;
        };
    }
}
