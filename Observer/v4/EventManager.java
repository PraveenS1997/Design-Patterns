package Observer.v4;

import Observer.v4.subscribers.Subscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    private final Map<EventType,List<Subscriber>> subscribers;

    public EventManager(){
        this.subscribers = new HashMap<>();
    }

    public Map<EventType, List<Subscriber>> getSubscribers() {
        return subscribers;
    }

    public void registerSubscriber(EventType eventType, Subscriber subscriber){
        if(!subscribers.containsKey(eventType)){
            subscribers.put(eventType, new ArrayList<>());
        }
        subscribers.get(eventType).add(subscriber);
    }

    public void deregisterSubscriber(EventType eventType, Subscriber subscriber){
        if(subscribers.containsKey(eventType)){
            subscribers.get(eventType).remove(subscriber);
        }
    }

    public void notifySubscribers(EventType eventType, String data){
        for(Subscriber subscriber: subscribers.get(eventType)){
            subscriber.update(data);
        }
    }
}
