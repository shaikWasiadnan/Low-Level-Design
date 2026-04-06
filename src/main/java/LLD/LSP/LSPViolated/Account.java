package LLD.LSP.LSPViolated;


//LSP Stands for Liskov substitution principle : A child class should be substituble in place of
//Parent class
//if any method takes parent class as its parameter then here should be no problem if we pass
//its child class or its implementation
//child class can only be an extension for parent class and it should not narrow down parent

public interface Account {
    void deposit(long amount);
    void withDraw(long amount);
}
