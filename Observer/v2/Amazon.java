package Observer.v2;

import Observer.services.EmailService;
import Observer.services.InventoryManagementService;
import Observer.services.InvoiceService;
import Observer.services.SellerService;

public class Amazon {
    private final OrderPlacedFacade orderPlacedFacade;

    public Amazon(OrderPlacedFacade orderPlacedFacade) {
        this.orderPlacedFacade = orderPlacedFacade;
    }

    public void orderPlaced(){
        this.orderPlacedFacade.orderPlaced();
    }
}
