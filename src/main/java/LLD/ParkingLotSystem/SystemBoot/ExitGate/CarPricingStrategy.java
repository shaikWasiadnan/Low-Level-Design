package LLD.ParkingLotSystem.SystemBoot.ExitGate;

public class CarPricingStrategy implements PricingStrategy{
    @Override
    public double calculatePrice(int hoursParked) {
        return (hoursParked <=1)?5.0:5.0+((hoursParked-1)*5.0);
    }
}
