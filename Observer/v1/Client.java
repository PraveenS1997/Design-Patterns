package Observer.v1;

import Observer.services.EmailService;
import Observer.services.InventoryManagementService;
import Observer.services.InvoiceService;
import Observer.services.SellerService;

public class Client {
    public static void main(String[] args) {
        Amazon amazon = new Amazon(new SellerService(), new InvoiceService(), new InventoryManagementService(), new EmailService());
        amazon.orderPlaced();
    }
}
