package LLD.StrategyDesignPattern.Shopping;

public class UPIPayment implements PaymentStrategy{
    private String upiId;
    public UPIPayment(String upiId){
        this.upiId = upiId;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paying through UPI");
        //Logic to pay through UPI
    }
}
