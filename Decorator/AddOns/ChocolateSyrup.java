package Decorator.AddOns;

import Decorator.IceCream;

public class ChocolateSyrup implements IceCream {
    private final IceCream iceCream;
    private final int chocoSyrupPrice;
    private final String description;

    public ChocolateSyrup(IceCream iceCream){
        this.chocoSyrupPrice = 5;
        this.description = "| Chocolate Syrup |";
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        if(iceCream == null){
            return description;
        }
        return iceCream.getDescription() + " " + description;
    }

    @Override
    public int getCost() {
        if(iceCream == null){
            return chocoSyrupPrice;
        }
        return iceCream.getCost() + chocoSyrupPrice;
    }
}

