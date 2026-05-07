package LLD.ParkingLotSystem.SystemBoot.ExitGate;

public class TruckPricingStrategy implements PricingStrategy{
    @Override
    public double calculatePrice(int hoursParked) {
        return (hoursParked <=1)?10.0:10.0+((hoursParked-1)*10.0);
    }
}
