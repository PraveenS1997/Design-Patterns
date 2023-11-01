package Observer.v4;

public class Amazon {
    private static Amazon instance;

    private final EventManager eventManager = new EventManager();

    public EventManager getEventManager() {
        return eventManager;
    }

    public static Amazon getInstance(){
        if(instance == null){
            instance = new Amazon();
        }
        return instance;
    }

    public void orderPlaced(){
        // do the business logic when order is placed
        // then notify all the subscribers who are listening
        // to the orderPlaced event
        eventManager.notifySubscribers(EventType.OrderPlaced, "order was placed");
    }

    public void orderCanceled(){
        // do the business logic when order is canceled
        // then notify all the subscribers who are listening
        // to the orderCanceled event
        eventManager.notifySubscribers(EventType.OrderCanceled, "order was canceled");
    }
}
