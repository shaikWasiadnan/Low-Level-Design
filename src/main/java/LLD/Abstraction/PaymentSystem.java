package LLD.Abstraction;

public abstract class PaymentSystem {
    protected String transactionId;
    public PaymentSystem(String transactionId){
        this.transactionId=transactionId;
    }
    public abstract void initiatePayment(double amount);
    public boolean checkFraud(){
        System.out.println("Checking for fraud for id: "+this.transactionId);
        return false;
    }
}
