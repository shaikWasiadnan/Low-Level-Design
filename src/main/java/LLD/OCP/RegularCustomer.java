package LLD.OCP;

public class RegularCustomer implements DiscountStrategy{
    @Override
    public double calculateDiscount(double amount) {
        return amount*0.10;
    }
}
