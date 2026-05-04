package LLD.FoodOrderingSystem.StrategyPattern;

public class Diwali implements DiscountStrategy{
    //20% discount
    @Override
    public double applyDiscount(double amount) {
        return amount-0.8;
    }
}
