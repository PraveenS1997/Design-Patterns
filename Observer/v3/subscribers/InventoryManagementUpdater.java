package Observer.v3.subscribers;

import Observer.services.InventoryManagementService;
import Observer.v3.Amazon;

public class InventoryManagementUpdater implements OrderPlacedEventSubscriber{
    private final InventoryManagementService inventoryManagementService;

    public InventoryManagementUpdater(InventoryManagementService inventoryManagementService) {
        this.inventoryManagementService = inventoryManagementService;
        Amazon.getInstance().registerSubscriber(this);
    }

    @Override
    public void onOrderPlaced(Object orderDetails) {
        inventoryManagementService.updateInventory();
    }
}
