package LLD.Encapsulation;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String password;
    public BankAccount(String accountNumber,double balance,String password){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.password=password;
    }

    public double getBalance() {
        return balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Amount added to bank account total balance is: "+balance);
        }
        else {
            System.out.println("Invalid Amount");
        }
    }
    public void withdraw(double amount,String password){
        if(!this.password.equals(password)){
            System.out.println("Incorrect Password");
            return;
        }
        if (amount>this.balance) {
            System.out.println("Insufficient Balance");
            return;
        }
        if (amount<=0) {
            System.out.println("Amount is negative please add correct amount");
            return;
        }
        balance-=amount;
        System.out.println("Amount withdrawn remaining balance: "+this.balance);
    }
}
