package LLD.ObserverPattern.UberRide;

public class DriverApp implements UberRideSubscriber{
    @Override
    public void update(String message) {
        System.out.println("Your status is: "+ message);
    }
}
