package LLD.FactoryPattern.Discount;

public class PercentageDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double amount) {
        return amount*0.8;
    }
}
