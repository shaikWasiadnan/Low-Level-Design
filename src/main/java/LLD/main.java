package LLD;


import LLD.SRP.Shopping.SRPFollowed.Item;
import LLD.SRP.Shopping.SRPFollowed.Persistence;
import LLD.SRP.Shopping.SRPFollowed.ShoppingCart;

public class main{
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(new Item("Flour",90));
        cart.addToCart(new Item("Oil",280));
        System.out.println(cart.calculateTotal());
        Persistence persistence = new Persistence(cart);
        persistence.saveToDb();
    }
}
