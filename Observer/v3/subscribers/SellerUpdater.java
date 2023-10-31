package Observer.v3.subscribers;

import Observer.services.SellerService;
import Observer.v3.Amazon;

public class SellerUpdater implements OrderPlacedEventSubscriber{
    private final SellerService sellerService;

    public SellerUpdater(SellerService sellerService) {
        this.sellerService = sellerService;
        Amazon.getInstance().registerSubscriber(this);
    }
    @Override
    public void onOrderPlaced(Object orderDetails) {
        sellerService.notifySeller();
    }
}
