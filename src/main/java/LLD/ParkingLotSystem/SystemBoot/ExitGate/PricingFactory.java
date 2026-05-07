package LLD.ParkingLotSystem.SystemBoot.ExitGate;

import LLD.ParkingLotSystem.SystemBoot.Vechile;
import LLD.ParkingLotSystem.SystemBoot.enums.VechileType;

public class PricingFactory {
    public static PricingStrategy getPricingStrategy(Vechile vechile){
        VechileType type = vechile.getVechileType();
        if(type == VechileType.BIKE){
            return new BikePricingStrategy();
        }
        else if(type == VechileType.CAR){
            return new CarPricingStrategy();
        }
        else if(type == VechileType.TRUCK){
            return new TruckPricingStrategy();
        }
        else {
            throw new RuntimeException("Vechile not supported");
        }
    }
}
