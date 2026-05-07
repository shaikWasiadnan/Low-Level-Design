package LLD.ParkingLotSystem.SystemBoot.Main;

import LLD.ParkingLotSystem.SystemBoot.*;
import LLD.ParkingLotSystem.SystemBoot.EntryGate.EntryGate;
import LLD.ParkingLotSystem.SystemBoot.EntryGate.ParkingTicket;
import LLD.ParkingLotSystem.SystemBoot.ExitGate.ExitGate;
import LLD.ParkingLotSystem.SystemBoot.enums.SpotType;
import LLD.ParkingLotSystem.SystemBoot.enums.VechileType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        System.out.println("Process Boot Up");
        List<ParkingSpot> physicalSpots = new ArrayList<>();
        physicalSpots.add(new ParkingSpot(4,SpotType.COMPACT,50));
        physicalSpots.add(new ParkingSpot(1,SpotType.COMPACT,10));
        physicalSpots.add(new ParkingSpot(2,SpotType.COMPACT,20));
        physicalSpots.add(new ParkingSpot(3,SpotType.COMPACT,30));
        SpotAssignmentStrategy strategy1 = new FirstAvailableSpotStrategy(physicalSpots);
        SpotAssignmentStrategy strategy2 = new SpotNearestToElevatorStrategy(physicalSpots);

        System.out.println("Vechile1 entry at entry gate");
        Vechile vechile  = new Vechile("IND-1230", VechileType.CAR);
        EntryGate entryGate = new EntryGate(strategy1);
        ParkingTicket ticket1 = entryGate.processVechileEntry(vechile,SpotType.COMPACT);
        System.out.println("Distance from elevator is: "+ticket1.getSpot().getDistanceFromElevator());

        System.out.println("Vechile2 entry at entry gate");
        Vechile vechile2  = new Vechile("IND-4560", VechileType.CAR);
        EntryGate entryGate1 = new EntryGate(strategy2);
        ParkingTicket ticket2 = entryGate.processVechileEntry(vechile, SpotType.COMPACT);
        System.out.println("Distance from elevator is: "+ticket2.getSpot().getDistanceFromElevator());

        System.out.println("Both existed");

        ExitGate exitGate = new ExitGate(strategy1);
        exitGate.processVechileExit(ticket1,2);

        ExitGate exitGate1 = new ExitGate(strategy2);
        exitGate.processVechileExit(ticket2,2);


    }
}
