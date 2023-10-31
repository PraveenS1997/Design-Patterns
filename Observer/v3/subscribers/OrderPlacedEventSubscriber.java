package Observer.v3.subscribers;

public interface OrderPlacedEventSubscriber {
    void onOrderPlaced(Object orderDetails);
}
