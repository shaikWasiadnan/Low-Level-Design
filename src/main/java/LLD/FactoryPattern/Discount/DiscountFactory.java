package LLD.FactoryPattern.Discount;

public class DiscountFactory {
    public static DiscountStrategy getDiscountStrategy(String userType, String dayOfWeek){
        if(userType.equals("PRIME_MEMEBER") || dayOfWeek.equals("BLACK_FRIDAY")){
            return new PercentageDiscount();
        }
        else if(userType.equals("NEW")){
            return new FlatDiscount();
        }
        else{
            return new NoDiscount();
        }
    }
}
