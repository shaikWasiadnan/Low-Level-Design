package LLD.LSP.LSPViolated;


//  LSP is violating here because FD will not have Withdraw option
public class FixedDepositAcc implements Account{
    private long balance;
    public FixedDepositAcc(){
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
        throw new UnsupportedOperationException("Withdrawel not allowed here as its a FD Account");
    }
}
