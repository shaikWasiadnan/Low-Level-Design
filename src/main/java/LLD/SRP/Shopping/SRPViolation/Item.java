package LLD.SRP.Shopping.SRPViolation;

public class Item {
    private String itemName;
    private double itemPrice;
    public Item(String itemName,double itemPrice){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }
    public String getItemName(){
        return this.itemName;
    }
    public double getItemPrice(){
        return this.itemPrice;
    }
}
