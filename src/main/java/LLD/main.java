package LLD;


import LLD.OCP.Shopping.OCPViolated.Item;
import LLD.OCP.Shopping.OCPViolated.Persistence;
import LLD.OCP.Shopping.OCPViolated.ShoppingCart;


public class main{
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(new Item("Curd",40));
        Persistence persistence = new Persistence(cart);
        persistence.saveToSQL();
    }
}
