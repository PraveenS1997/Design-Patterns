package Observer.v2;

import Observer.services.EmailService;
import Observer.services.InventoryManagementService;
import Observer.services.InvoiceService;
import Observer.services.SellerService;

public class OrderPlacedFacade {
    private final SellerService sellerService;
    private final InvoiceService invoiceService;
    private final InventoryManagementService inventoryManagementService;
    private final EmailService emailService;

    public OrderPlacedFacade(SellerService sellerService,
                  InvoiceService invoiceService,
                  InventoryManagementService inventoryManagementService,
                  EmailService emailService) {
        this.sellerService = sellerService;
        this.invoiceService = invoiceService;
        this.inventoryManagementService = inventoryManagementService;
        this.emailService = emailService;
    }

    public void orderPlaced(){
        invoiceService.generateInvoice();
        inventoryManagementService.updateInventory();
        sellerService.notifySeller();
        emailService.sendEmail();
    }
}
