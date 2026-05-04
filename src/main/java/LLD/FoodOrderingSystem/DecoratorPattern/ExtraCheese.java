package LLD.FoodOrderingSystem.DecoratorPattern;

public class ExtraCheese extends ToppingDecorator{
    public ExtraCheese(Burger burger){
        super(burger);
    }
    @Override
    public String getDescription() {
        return burger.getDescription()+" Extra cheese";
    }

    @Override
    public double getPrice() {
        return burger.getPrice()+2.0;
    }
}
