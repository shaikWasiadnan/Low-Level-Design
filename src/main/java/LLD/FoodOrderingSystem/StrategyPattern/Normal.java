package LLD.FoodOrderingSystem.StrategyPattern;

public class Normal implements DiscountStrategy{
    //No discount
    @Override
    public double applyDiscount(double amount) {
        return amount;
    }
}
