package Observer.v2;

import Observer.services.*;

public class Client {
    public static void main(String[] args) {
        OrderPlacedFacade facade = new OrderPlacedFacade(new SellerService(), new InvoiceService(), new InventoryManagementService(), new EmailService());
        Amazon amazon = new Amazon(facade);
        amazon.orderPlaced();
    }
}
