package Decorator;

import Decorator.AddOns.ChocolateSyrup;
import Decorator.AddOns.StrawberryScoop;
import Decorator.AddOns.VanillaScoop;
import Decorator.BaseAddOns.OrangeCone;
import Decorator.BaseAddOns.VanillaCone;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream = new VanillaCone();
        iceCream = new ChocolateSyrup(iceCream);
        iceCream = new OrangeCone(iceCream);
        iceCream = new VanillaScoop(iceCream);
        iceCream = new StrawberryScoop(iceCream);

        System.out.println("Total Price: " + iceCream.getCost());
        System.out.println(iceCream.getDescription());

        IceCream secondIcecream = new VanillaScoop(
                                        new VanillaCone(
                                            new ChocolateSyrup(
                                                    new OrangeCone()
                                            )
                                        ));

        System.out.println("Total Price: " + secondIcecream.getCost());
        System.out.println(secondIcecream.getDescription());
    }
}
