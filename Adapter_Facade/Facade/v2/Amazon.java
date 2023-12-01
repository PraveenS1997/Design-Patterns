package Adapter_Facade.Facade.v2;

public class Amazon {
    private final OrderPlacedFacade orderPlacedFacade;

    public Amazon(OrderPlacedFacade orderPlacedFacade){
        this.orderPlacedFacade = orderPlacedFacade;
    }

    public void orderPlaced(){
        orderPlacedFacade.orderPlaced();
    }
}
