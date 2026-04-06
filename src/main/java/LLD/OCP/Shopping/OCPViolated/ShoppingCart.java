package LLD.OCP.Shopping.OCPViolated;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> allItems;
    public ShoppingCart(){
        allItems=new ArrayList<>();
    }
    public void addToCart(Item item){
        allItems.add(item);
        System.out.println(item.getItemName()+" added successfully");
    }
    public double calculateTotal(){
        double total = 0;
        for(Item item : allItems){
            total+=item.getItemPrice();
        }
        return total;
    }
    public List<Item> getAllItems(){
        return allItems;
    }
}
