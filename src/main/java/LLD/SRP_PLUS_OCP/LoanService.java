package LLD.SRP_PLUS_OCP;

public class LoanService {
    private LoanValidator validator;
    private LoanRepository repo;
    public LoanService(LoanValidator validator,LoanRepository repo){
        this.validator=validator;
        this.repo=repo;
    }
    public double approveLoan(LoanIntrestStrategy strategy){
        if(validator.isValid()){
            repo.saveLoanToDb();
            return strategy.getIntrestRate();

        }
        return -1;
    }
}
