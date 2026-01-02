package LLD;

import LLD.Encapsulation.BankAccount;
import LLD.Inheritance.Car;
import LLD.Inheritance.Engine;
import LLD.Inheritance.Wheels;
import LLD.Polymorphism.Circle;
import LLD.Polymorphism.Rectangle;
import LLD.Polymorphism.Shape;

import java.util.ArrayList;
import java.util.List;

public class main{
    public static void main(String[] args) {
//        LightBulb bulb = new LightBulb(true,"white");
//        bulb.switchOn();
//        bulb.changeColor("yellow");
//        bulb.switchOff();
//        bulb.changeColor("green");
//        bulb.switchOn();
//        BankAccount account = new BankAccount("1234",0,"1230");
//        System.out.println(account.getAccountNumber());
//        System.out.println(account.getBalance());
//        account.withdraw(500,"1230");
//        account.deposit(1000);
//        account.withdraw(500,"1230");
//        Engine eng = new Engine();
//        Wheels wheel = new Wheels();
//        Car car = new Car(eng,wheel);
//        car.drive();
        List<Shape> list = new ArrayList<>();
        list.add(new Circle(3.0));
        list.add(new Rectangle(3.0,4.0));
        for(Shape item : list){
            System.out.println(item.calculateArea());
        }
    }
}
