package LLD;


import LLD.OCP.Shopping.OCPFollowed.*;

public class main{
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(new Item("Cake",50));
        Persistance p1 = new SQLPersistance();
        p1.save(cart);
        ShoppingCart cart2 = new ShoppingCart();
        cart2.addToCart(new Item("Airpods",1000));
        Persistance p2 = new MongoPersistence();
        p2.save(cart2);
    }

}
