package Observer.v4.subscribers;

import Observer.services.InventoryManagementService;
import Observer.v4.Amazon;
import Observer.v4.EventType;

public class InventoryManagementUpdater implements Subscriber {
    private final InventoryManagementService inventoryManagementService;

    public InventoryManagementUpdater(InventoryManagementService inventoryManagementService) {
        this.inventoryManagementService = inventoryManagementService;
        Amazon.getInstance().getEventManager().registerSubscriber(EventType.OrderPlaced,this);
    }

    @Override
    public void update(Object orderDetails) {
        System.out.print(orderDetails.toString() + " ");
        inventoryManagementService.updateInventory();
    }
}
