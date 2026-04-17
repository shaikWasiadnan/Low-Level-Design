package LLD.ObserverPattern.UberRide;

public interface UberRideSubject {
    void attach(UberRideSubscriber subscriber);
    void detach(UberRideSubscriber subscriber);
    void notifyObservers();

}
