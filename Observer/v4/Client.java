package Observer.v4;

import Observer.services.EmailService;
import Observer.services.InventoryManagementService;
import Observer.services.InvoiceService;
import Observer.services.SellerService;
import Observer.v4.subscribers.*;

public class Client {
    public static void main(String[] args) {
        // set up the subscribers of order placed event
        new EmailSender(new EmailService());
        new InventoryManagementUpdater(new InventoryManagementService());
        new InvoiceGenerator(new InvoiceService());
        new SellerUpdater(new SellerService());

        // set up the publisher
        Amazon.getInstance().orderPlaced();
        System.out.println("--------------------------------");
        Amazon.getInstance().orderCanceled();
    }
}
