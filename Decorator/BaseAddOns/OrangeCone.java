package Decorator.BaseAddOns;

import Decorator.IceCream;

public class OrangeCone implements IceCream {
    private IceCream iceCream;
    private final int orangeConePrice;
    private final String description;

    public OrangeCone(){
        this.orangeConePrice = 20;
        this.description = "| Orange Cone |";
    }

    public OrangeCone(IceCream iceCream){
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
            return orangeConePrice;
        }
        return iceCream.getCost() + orangeConePrice;
    }
}
