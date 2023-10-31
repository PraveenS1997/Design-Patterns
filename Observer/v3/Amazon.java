package Observer.v3;

import Observer.v3.subscribers.OrderPlacedEventSubscriber;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    private final List<OrderPlacedEventSubscriber> orderPlacedEventSubscribers = new ArrayList<>();
    private static Amazon instance;

    private Amazon(){

    }

    public void registerSubscriber(OrderPlacedEventSubscriber orderPlacedEventSubscriber){
        this.orderPlacedEventSubscribers.add(orderPlacedEventSubscriber);
    }

    public void deRegisterSubscriber(OrderPlacedEventSubscriber orderPlacedEventSubscriber){
        this.orderPlacedEventSubscribers.remove(orderPlacedEventSubscriber);
    }

    public void orderPlaced(){
        for(OrderPlacedEventSubscriber subscriber: this.orderPlacedEventSubscribers){
            subscriber.onOrderPlaced(new Object());
        }
    }

    public static Amazon getInstance(){
        if(instance == null){
            instance = new Amazon();
        }
        return instance;
    }
}
