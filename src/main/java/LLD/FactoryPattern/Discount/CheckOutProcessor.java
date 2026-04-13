package LLD.FactoryPattern.Discount;

public class CheckOutProcessor {
    public void processOrder(String userType,String dayOfWeek,double cartTotal){
        DiscountStrategy strategy = DiscountFactory.getDiscountStrategy(userType,dayOfWeek);
        double amount = strategy.applyDiscount(cartTotal);
        System.out.println(amount);
    }

}
