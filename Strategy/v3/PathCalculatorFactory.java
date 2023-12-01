package Strategy.v3;

import Strategy.PathCalulators.BikePathCalculator;
import Strategy.PathCalulators.CarPathCalculator;
import Strategy.PathCalulators.PathCalculator;
import Strategy.PathCalulators.WalkPathCalculator;
import Strategy.TransportationMode;

// practical factory implementation to get the correct
// pathCalculator object based on the given Transportation mode
public class PathCalculatorFactory {
    public static PathCalculator getPathCalculatorByMode(TransportationMode mode){
        return switch (mode){
            case CAR -> new CarPathCalculator();
            case BIKE -> new BikePathCalculator();
            case WALK -> new WalkPathCalculator();
        };
    }
}
