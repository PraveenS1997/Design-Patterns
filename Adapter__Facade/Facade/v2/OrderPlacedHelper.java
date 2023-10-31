package Adapter__Facade.Facade.v2;

import Adapter__Facade.Facade.Services.*;

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
