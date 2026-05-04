package LLD.FoodOrderingSystem.DecoratorPattern;

abstract class ToppingDecorator implements Burger{
    protected Burger burger;
    public ToppingDecorator(Burger burger){
        this.burger = burger;
    }
}
