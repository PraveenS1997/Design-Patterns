package Strategy.PathCalulators;

public class BikePathCalculator implements PathCalculator {
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Finding route from " + source + " to " + destination + " for Bikes!");
    }
}
