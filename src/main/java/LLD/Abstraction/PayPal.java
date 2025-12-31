package LLD.Abstraction;

public class PayPal extends PaymentSystem{
    private String email;
    public PayPal(String transactionId,String email){
        super(transactionId);
        this.email=email;
    }
    @Override
    public void initiatePayment(double amount) {
        System.out.println("logging into paypal using email id: "+email);
        System.out.println("Payment made of rupees: "+amount+" from PayPal");
    }
}
