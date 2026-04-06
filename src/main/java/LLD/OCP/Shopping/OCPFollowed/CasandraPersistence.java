package LLD.OCP.Shopping.OCPFollowed;

public class CasandraPersistence implements Persistance{
    @Override
    public void save(ShoppingCart cart) {
        for(Item item: cart.getAllItems()){
            System.out.println(item.getItemName()+ " Added to Casandra");
        }
    }
}
