package LLD.FoodOrderingSystem.ObserverPattern;

public class UserApp implements Subscriber{
    @Override
    public void getStatus(String message) {
        System.out.println("Your order status is: "+message);
    }
}
