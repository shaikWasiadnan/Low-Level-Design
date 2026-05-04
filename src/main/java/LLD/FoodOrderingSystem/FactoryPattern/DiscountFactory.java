package LLD.FoodOrderingSystem.FactoryPattern;

import LLD.FoodOrderingSystem.StrategyPattern.DiscountStrategy;
import LLD.FoodOrderingSystem.StrategyPattern.Diwali;
import LLD.FoodOrderingSystem.StrategyPattern.Normal;
import LLD.FoodOrderingSystem.StrategyPattern.SwiggyOne;

public class DiscountFactory {
    public static DiscountStrategy getDiscountStrategy(String condition){
        if(condition.equalsIgnoreCase("SWIGGYONE")){
            return new SwiggyOne();
        }
        else if(condition.equalsIgnoreCase("DIWALI")){
            return new Diwali();
        }
        else{
            return new Normal();
        }
    }
}
