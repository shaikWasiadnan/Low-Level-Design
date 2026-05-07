package LLD.ParkingLotSystem.SystemBoot.ExitGate;

import LLD.ParkingLotSystem.SystemBoot.EntryGate.ParkingTicket;
import LLD.ParkingLotSystem.SystemBoot.ParkingSpot;
import LLD.ParkingLotSystem.SystemBoot.SpotAssignmentStrategy;
import LLD.ParkingLotSystem.SystemBoot.Vechile;
import LLD.ParkingLotSystem.SystemBoot.enums.SpotType;

public class ExitGate {
    private SpotAssignmentStrategy strategy;

    public ExitGate(SpotAssignmentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processVechileExit(ParkingTicket ticket, int hoursParked){
        System.out.println("Vechile: "+ticket.getVechile().getLicensePlateNumber()+" has arrived at exit gate");
        PricingStrategy pricingStrategyObj = PricingFactory.getPricingStrategy(ticket.getVechile());
        double amount = pricingStrategyObj.calculatePrice(hoursParked);
        System.out.println("Amount to be paid is: "+amount);
        ParkingSpot spot = ticket.getSpot();
        strategy.releaseSpot(spot);
        System.out.println("This spot is free now: "+spot);
    }
}
