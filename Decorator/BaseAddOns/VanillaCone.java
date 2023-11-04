package Decorator.BaseAddOns;

import Decorator.IceCream;

public class VanillaCone implements IceCream {
    private IceCream iceCream;
    private final int vanillaConePrice;
    private final String description;

    public VanillaCone(){
        this.vanillaConePrice = 10;
        this.description = "| Vanilla Cone |";
    }

    public VanillaCone(IceCream iceCream){
        this();
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
            return vanillaConePrice;
        }
        return iceCream.getCost() + vanillaConePrice;
    }
}
