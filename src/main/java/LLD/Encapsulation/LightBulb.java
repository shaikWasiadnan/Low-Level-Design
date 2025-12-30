package LLD.Encapsulation;

public class LightBulb {
    private boolean currentlyOn;
    private String color;
    public LightBulb(boolean currentlyOn,String color){
        this.currentlyOn = currentlyOn;
        this.color = color;
    }
    public void switchOn(){
        if(currentlyOn){
            System.out.println("Already On");

        }
        else{
            currentlyOn = true;
            System.out.println("Bulb switched on");
        }
    }
    public void switchOff(){
        if(!currentlyOn){
            System.out.println("Already off");
        }
        else{
            currentlyOn = false;
            System.out.println("Bulb switched off");
        }
    }
    public void changeColor(String color){
        if(this.color.equals(color) || currentlyOn){
            System.out.println("Change color failed");
        }
        else {
            this.color = color;
            System.out.println("color changed to: "+color);
        }
    }
}
