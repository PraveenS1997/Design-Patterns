package Strategy.RouteCalulators;

public class CarRouteCalculator implements RouteCalculator{
    @Override
    public void findRoute(String source, String destination) {
        System.out.println("Finding route from " + source + " to " + destination + " for Cars!");
    }
}
