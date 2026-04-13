package LLD.StrategyDesignPattern.Shopping;

//This is a Context class
public class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    //This will decide on the fly during runtime which strategy to inject
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void checkOut(int totalAmount){
        if(paymentStrategy == null){
            throw new UnsupportedOperationException();
        }
        paymentStrategy.pay(totalAmount);
    }
}
