package LLD.SRP.Shopping.SRPViolation;

import java.util.ArrayList;
import java.util.List;

public class shoppingCart {

    private List<Item> allItemsList;
    public shoppingCart(){
        allItemsList = new ArrayList<>();
    }
    public void addToCart(Item item){
        allItemsList.add(item);
        System.out.println("Item: "+item.getItemName());
    }
    public double calculateTotal(){
        double total = 0;
        for(Item item : allItemsList){
            total+=item.getItemPrice();
        }
        return total;
    }
    //SRP VIOLATION
    public void saveToDb(){
        for(Item item : allItemsList){
            System.out.println(item.getItemName()+" saved toDb");
        }
    }
}
