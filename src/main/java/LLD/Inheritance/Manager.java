package LLD.Inheritance;

public class Manager extends Employee{
    private double bonus;
    public Manager(String name, double salary,double bonus) {
        super(name, salary);
        this.bonus=bonus;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Bonus is : "+bonus);
    }


    public double calcuateTotalSalary(){
        return this.bonus+this.salary;
    }
}
