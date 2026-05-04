package LLD.FoodOrderingSystem.DecoratorPattern;

public class ClassicVegBurger implements Burger{
    @Override
    public String getDescription() {
        return "This is a Classic veg burger";
    }

    @Override
    public double getPrice() {
        return 8.0;
    }
}
