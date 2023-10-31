package Strategy.RouteCalulators;

public class BikeRouteCalculator implements RouteCalculator{
    @Override
    public void getRoute(String source, String destination) {
        System.out.println("Finding route from " + source + " to " + destination + " for Bikes!");
    }
}
