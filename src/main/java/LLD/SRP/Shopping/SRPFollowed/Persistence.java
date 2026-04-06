package LLD.SRP.Shopping.SRPFollowed;

public class Persistence {
    private ShoppingCart cart;
    public Persistence(ShoppingCart cart){
        this.cart=cart;
    }
    public void saveToDb(){
        for (Item item : cart.getAllItemsList()){
            System.out.println(item.getItemName()+ " Added to DB");
        }
    }
}
