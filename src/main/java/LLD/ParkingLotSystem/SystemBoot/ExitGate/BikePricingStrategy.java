package LLD.ParkingLotSystem.SystemBoot.ExitGate;

public class BikePricingStrategy implements PricingStrategy{
    @Override
    public double calculatePrice(int hoursParked) {
        return (hoursParked <=1)?3.0:3.0+((hoursParked-1)*3.0);
    }
}
