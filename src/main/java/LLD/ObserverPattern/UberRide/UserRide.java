package LLD.ObserverPattern.UberRide;

import java.util.ArrayList;
import java.util.List;

public class UserRide implements UberRideSubject{
    private List<UberRideSubscriber> observers = new ArrayList<>();
    private String message;
    @Override
    public void attach(UberRideSubscriber subscriber) {
        observers.add(subscriber);
    }

    @Override
    public void detach(UberRideSubscriber subscriber) {
        observers.remove(subscriber);
    }

    @Override
    public void notifyObservers() {
        for(UberRideSubscriber ob : observers){
            ob.update(message);

        }
    }
    public void setRideMessage(String message){
        this.message = message;
        notifyObservers();
    }
}
