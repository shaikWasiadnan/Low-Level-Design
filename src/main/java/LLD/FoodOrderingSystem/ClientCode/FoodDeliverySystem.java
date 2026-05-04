package LLD.FoodOrderingSystem.ClientCode;


import LLD.FoodOrderingSystem.DecoratorPattern.Burger;
import LLD.FoodOrderingSystem.DecoratorPattern.ClassicVegBurger;
import LLD.FoodOrderingSystem.DecoratorPattern.ExtraCheese;
import LLD.FoodOrderingSystem.DecoratorPattern.Jalapenos;
import LLD.FoodOrderingSystem.FactoryPattern.DiscountFactory;
import LLD.FoodOrderingSystem.ObserverPattern.DriverApp;
import LLD.FoodOrderingSystem.ObserverPattern.PublisherKitchen;
import LLD.FoodOrderingSystem.ObserverPattern.UserApp;
import LLD.FoodOrderingSystem.StrategyPattern.DiscountStrategy;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        System.out.println("--User added item--");
        Burger myOrder = new ClassicVegBurger();
        System.out.println("Order description is: "+myOrder.getDescription());
        System.out.println("Order price is: "+myOrder.getPrice());
        System.out.println("--Customer added extra cheese--");
        myOrder = new ExtraCheese(myOrder);
        System.out.println("Order description is: "+myOrder.getDescription());
        System.out.println("Order price is: "+myOrder.getPrice());
        System.out.println("--Customer added Jalapenos--");
        myOrder = new Jalapenos(myOrder);
        System.out.println("Order description is: "+myOrder.getDescription());
        System.out.println("Order price is: "+myOrder.getPrice());

        String userSubscription = "SwiggyOne";
        DiscountStrategy getDiscountObject = DiscountFactory.getDiscountStrategy(userSubscription);
        double amountAfterDiscount = getDiscountObject.applyDiscount(myOrder.getPrice());

        System.out.println("Discount applied price to be paid = "+ amountAfterDiscount);

        System.out.println("Order successful, sent to kitchen");
        PublisherKitchen kitchen = new PublisherKitchen();
        kitchen.attach(new DriverApp());
        kitchen.attach(new UserApp());

        System.out.println("Kitchen is preparing food");
        kitchen.setMessage("Prepared");
        System.out.println("/ORDER COMPLETE/");
    }
}
