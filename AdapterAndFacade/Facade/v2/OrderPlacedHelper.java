package AdapterAndFacade.Facade.v2;

import AdapterAndFacade.Facade.Services.*;

public class OrderPlacedHelper {
    private InventoryService inventoryService;
    private SellerService sellerService;
    private AppNotificationService appNotificationService;
    private EmailService emailService;
    private LogisticsService logisticsService;

    public void orderPlaced(){
        inventoryService.update();
        sellerService.notifySeller();
        appNotificationService.sendNotification();
        emailService.sendEmail();
        logisticsService.notifyLogistics();
    }
}
