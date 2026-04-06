package LLD.SRP.Shopping.SRPFollowed;


import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> allItemsList;
    public ShoppingCart(){
        allItemsList = new ArrayList<>();
    }
    public List<Item> getAllItemsList(){
        return allItemsList;
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


}
