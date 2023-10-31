package Observer.v3;

import Observer.services.*;
import Observer.v3.subscribers.*;

public class Client {
    public static void main(String[] args) {
        // since all the subscribers register themselves with same Amazon instance
        // so made the Amazon class as Singleton
        Amazon amazon = Amazon.getInstance();

        // set up the subscribers of order placed event
        EmailSender emailSender = new EmailSender(new EmailService());
        InventoryManagementUpdater inventoryUpdater = new InventoryManagementUpdater(new InventoryManagementService());
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator(new InvoiceService());
        SellerUpdater sellerUpdater = new SellerUpdater(new SellerService());

        // set up the publisher
        amazon.orderPlaced();
    }
}
