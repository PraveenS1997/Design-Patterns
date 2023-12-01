package Adapter_Facade.Facade.v1;

import Adapter_Facade.Facade.Services.*;

public class Amazon {
    private final InventoryService inventoryService;
    private final SellerService sellerService;
    private final AppNotificationService appNotificationService;
    private final EmailService emailService;
    private final LogisticsService logisticsService;

    public Amazon(InventoryService inventoryService,
                  SellerService sellerService,
                  AppNotificationService appNotificationService,
                  EmailService emailService,
                  LogisticsService logisticsService) {
        this.inventoryService = inventoryService;
        this.sellerService = sellerService;
        this.appNotificationService = appNotificationService;
        this.emailService = emailService;
        this.logisticsService = logisticsService;
    }

    public void orderPlaced(){
        inventoryService.update();
        sellerService.notifySeller();
        appNotificationService.sendNotification();
        emailService.sendEmail();
        logisticsService.notifyLogistics();
    }
}
