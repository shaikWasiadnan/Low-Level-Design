package LLD.Abstraction;


public class CreditCard extends PaymentSystem{
    private String cardNumber;
    public CreditCard(String transactionId,String cardNumber){
        super(transactionId);
        this.cardNumber=cardNumber;
    }

    @Override
    public void initiatePayment(double amount) {
        System.out.println("Validating card number: "+this.cardNumber);
        System.out.println("Payment made of rupees: "+amount+" from credit card");
    }
}
