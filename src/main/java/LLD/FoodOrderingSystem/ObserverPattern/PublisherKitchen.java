package LLD.FoodOrderingSystem.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class PublisherKitchen {
    private List<Subscriber> allSubscribers = new ArrayList<>();
    private String message;

    public void attach(Subscriber subscriber){
        allSubscribers.add(subscriber);
    }
    public void detach(Subscriber subscriber){
        allSubscribers.remove(subscriber);
    }
    public void notifyUsers(){
        for(Subscriber subscriber: allSubscribers){
            subscriber.getStatus(message);
        }
    }
    public void setMessage(String message){
        this.message = message;
        notifyUsers();
    }
}
