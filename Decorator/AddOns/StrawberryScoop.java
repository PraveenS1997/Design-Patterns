package Decorator.AddOns;

import Decorator.IceCream;

public class StrawberryScoop implements IceCream {
    private final IceCream iceCream;
    private final int strawberryScoopPrice;
    private final String description;

    public StrawberryScoop(IceCream iceCream){
        this.strawberryScoopPrice = 35;
        this.description = "| Strawberry Scoop |";
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
            return strawberryScoopPrice;
        }
        return iceCream.getCost() + strawberryScoopPrice;
    }
}

