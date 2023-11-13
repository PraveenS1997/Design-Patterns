package SOLID.v5_DIP.v3_dependency_injection;

import SOLID.v5_DIP.v3_dependency_injection.Birds.*;
import SOLID.v5_DIP.v3_dependency_injection.FlyingBehavior.CrowOwlFlyingBehavior;
import SOLID.v5_DIP.v3_dependency_injection.FlyingBehavior.FlyingBehavior;

public class Client {
    public static void main(String[] args) {
        FlyingBehavior crowOwlFlyingBehavior = new CrowOwlFlyingBehavior();
        Crow crow = new Crow("Crow", crowOwlFlyingBehavior);
        Owl owl = new Owl("Owl", crowOwlFlyingBehavior);

        crow.fly();
        owl.fly();
    }
}
