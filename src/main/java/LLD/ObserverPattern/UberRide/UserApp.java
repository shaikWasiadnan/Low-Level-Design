package LLD.ObserverPattern.UberRide;

public class UserApp implements UberRideSubscriber{
    @Override
    public void update(String message) {
        System.out.println("Driver's  status is: "+ message);
    }
}
