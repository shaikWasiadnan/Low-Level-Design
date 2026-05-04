package LLD.FoodOrderingSystem.StrategyPattern;

public class SwiggyOne implements DiscountStrategy{
    //Flat Discount of $5
    @Override
    public double applyDiscount(double amount) {
        return amount-5;
    }
}
