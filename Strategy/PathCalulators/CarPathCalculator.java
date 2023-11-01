package Strategy.PathCalulators;

public class CarPathCalculator implements PathCalculator {
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Finding route from " + source + " to " + destination + " for Cars!");
    }
}
