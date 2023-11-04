package Decorator.AddOns;

import Decorator.IceCream;

public class VanillaScoop implements IceCream {
    private final IceCream iceCream;
    private final int vanillaScoopPrice;
    private final String description;

    public VanillaScoop(IceCream iceCream){
        this.vanillaScoopPrice = 15;
        this.description = "| Vanilla Scoop |";
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
            return vanillaScoopPrice;
        }
        return iceCream.getCost() + vanillaScoopPrice;
    }
}

