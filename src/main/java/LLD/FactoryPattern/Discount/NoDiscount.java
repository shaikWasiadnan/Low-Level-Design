package LLD.FactoryPattern.Discount;

public class NoDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double amount) {
        return amount;
    }
}
