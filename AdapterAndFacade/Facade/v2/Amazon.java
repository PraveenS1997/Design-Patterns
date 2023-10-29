package AdapterAndFacade.Facade.v2;

public class Amazon {
    private OrderPlacedHelper orderPlacedHelper;
    public void orderPlaced(){
        orderPlacedHelper.orderPlaced();
    }
}
