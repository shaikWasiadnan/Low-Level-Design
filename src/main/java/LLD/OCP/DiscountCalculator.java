package LLD.OCP;

public class DiscountCalculator {
    public double calculateDiscount(DiscountStrategy strategy,double amount){
        double discount = strategy.calculateDiscount(amount);
        return amount-discount;
    }
}
