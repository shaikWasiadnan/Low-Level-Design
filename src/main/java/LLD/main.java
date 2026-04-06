package LLD;


import LLD.LSP.LSPFollowed.*;

import java.util.ArrayList;
import java.util.List;

public class main{
    public static void main(String[] args) {
        List<Account> withDrawable = new ArrayList<>();
        withDrawable.add(new SavingsAcc());
        withDrawable.add(new CurrentAcc());
        List<OnlyDeposit> onlyDeposits = new ArrayList<>();
        onlyDeposits.add(new FixedDepositAcc());
        BankClient client = new BankClient(withDrawable,onlyDeposits);
        client.processTransaction();

    }

}
