package LLD.FactoryPattern.Discount;

public class FlatDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double amount) {
        return amount-10;
    }
}
