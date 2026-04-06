package LLD;


import LLD.LSP.LSPViolated.Account;
import LLD.LSP.LSPViolated.CurrentAcc;
import LLD.LSP.LSPViolated.FixedDepositAcc;
import LLD.LSP.LSPViolated.SavingsAcc;


public class main{
    public static void main(String[] args) {
        Account savings = new SavingsAcc();
        savings.deposit(5000);
        savings.withDraw(2000);
        Account current = new CurrentAcc();
        current.deposit(2000);
        current.withDraw(6000);
        Account fixed = new FixedDepositAcc();
        fixed.deposit(8000);
        //Will get Exception here as withdrawel is not possible
        fixed.withDraw(5000);
    }

}
