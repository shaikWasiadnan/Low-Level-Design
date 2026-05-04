package LLD.FoodOrderingSystem.ObserverPattern;

public class DriverApp implements Subscriber{
    @Override
    public void getStatus(String message) {
        System.out.println("Your order status is: "+message+" please pick at counter");
    }
}
