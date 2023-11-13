package SOLID.v5_DIP.v3_dependency_injection.FlyingBehavior;

public class CrowOwlFlyingBehavior implements FlyingBehavior {
    @Override
    public void fly() {
        // this method contains the logic of crow & owl's flying behavior
        System.out.println("Crow & Owl's flying behavior");
    }
}
