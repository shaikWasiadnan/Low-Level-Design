package LLD.Inheritance;

public class Car {
    private Engine engine;
    private Wheels wheels;
    public Car(Engine engine,Wheels wheels){
        this.engine=engine;
        this.wheels=wheels;
    }
    public void drive(){
        engine.start();
        wheels.rotate();
    }
}
