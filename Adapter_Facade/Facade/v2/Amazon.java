package Adapter_Facade.Facade.v2;

public class Amazon {
    private OrderPlacedFacade orderPlacedFacade;
    public void orderPlaced(){
        orderPlacedFacade.orderPlaced();
    }
}
