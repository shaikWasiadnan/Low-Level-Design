package LLD.LSP.LSPFollowed;



public class FixedDepositAcc implements OnlyDeposit{
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


}
