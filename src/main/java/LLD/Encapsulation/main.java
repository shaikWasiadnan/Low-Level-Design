package LLD.Encapsulation;

public class main{
    public static void main(String[] args) {
//        LightBulb bulb = new LightBulb(true,"white");
//        bulb.switchOn();
//        bulb.changeColor("yellow");
//        bulb.switchOff();
//        bulb.changeColor("green");
//        bulb.switchOn();
        BankAccount account = new BankAccount("1234",0,"1230");
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
        account.withdraw(500,"1230");
        account.deposit(1000);
        account.withdraw(500,"1230");
    }
}
