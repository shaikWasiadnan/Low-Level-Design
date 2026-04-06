package LLD.LSP.LSPFollowed;

import java.util.List;

public class BankClient {
    private List<Account> withDrawableAcc;
    private List<OnlyDeposit> onlyDepositsAcc;
    public BankClient(List<Account> withDrawableAcc,List<OnlyDeposit> onlyDepositsAcc){
        this.withDrawableAcc = withDrawableAcc;
        this.onlyDepositsAcc = onlyDepositsAcc;
    }
    public void processTransaction(){
        for(Account acc : withDrawableAcc){
            acc.deposit(1000);
            acc.withDraw(500);
        }
        for (OnlyDeposit acc:onlyDepositsAcc){
            acc.deposit(8000);
        }
    }
}
