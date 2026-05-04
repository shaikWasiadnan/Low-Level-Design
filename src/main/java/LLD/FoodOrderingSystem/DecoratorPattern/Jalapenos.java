package LLD.FoodOrderingSystem.DecoratorPattern;

public class Jalapenos extends ToppingDecorator{
    public Jalapenos(Burger burger){
        super(burger);
    }
    @Override
    public String getDescription() {
        return burger.getDescription()+" Jalapenos";
    }

    @Override
    public double getPrice() {
        return burger.getPrice()+2.0;
    }
}
