package LLD.OCP.Shopping.OCPViolated;

public class Persistence {
    private ShoppingCart cart;
    public Persistence(ShoppingCart cart){
        this.cart = cart;
    }
    //OCP VIOLATION
    public void saveToSQL(){
        for(Item item: cart.getAllItems()){
            System.out.println(item.getItemName()+ " Added to SQL Server");
        }
    }
    public void saveToMongo(){
        for(Item item: cart.getAllItems()){
            System.out.println(item.getItemName()+ " Added to Mongo");
        }

    }
    public void saveToCasandra(){
        for(Item item: cart.getAllItems()){
            System.out.println(item.getItemName()+ " Added to Casandra");
        }
    }
}
