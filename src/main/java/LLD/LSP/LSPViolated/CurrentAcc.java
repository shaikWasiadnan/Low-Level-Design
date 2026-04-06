package LLD.LSP.LSPViolated;

public class CurrentAcc implements Account{
    private long balance;
    public CurrentAcc(){
        balance = 0;
    }
    public long getBalance(){
        return balance;
    }
    @Override
    public void deposit(long amount) {
        if(amount > 0){
            balance+=amount;
            System.out.println("Amount has been added, total balance is: "+ getBalance());
        }
        else {
            System.out.println("Invalid amount");
        }

    }

    @Override
    public void withDraw(long amount) {
        if(amount > 0 && amount <= getBalance()){
            balance-=amount;
            System.out.println("Amount has been deducted, remaining balance is: "+ getBalance());
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}
