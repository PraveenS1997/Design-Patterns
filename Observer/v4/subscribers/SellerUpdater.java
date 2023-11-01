package Observer.v4.subscribers;

import Observer.services.SellerService;
import Observer.v4.Amazon;
import Observer.v4.EventType;

public class SellerUpdater implements Subscriber {
    private final SellerService sellerService;

    public SellerUpdater(SellerService sellerService) {
        this.sellerService = sellerService;
        Amazon.getInstance().getEventManager().registerSubscriber(EventType.OrderCanceled,this);
    }
    @Override
    public void update(Object orderDetails) {
        System.out.print(orderDetails.toString() + " ");
        sellerService.notifySeller();
    }
}
