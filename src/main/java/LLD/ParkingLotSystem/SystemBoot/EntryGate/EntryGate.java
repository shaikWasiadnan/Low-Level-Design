package LLD.ParkingLotSystem.SystemBoot.EntryGate;

import LLD.ParkingLotSystem.SystemBoot.ParkingSpot;
import LLD.ParkingLotSystem.SystemBoot.SpotAssignmentStrategy;
import LLD.ParkingLotSystem.SystemBoot.Vechile;
import LLD.ParkingLotSystem.SystemBoot.enums.SpotType;

public class EntryGate {
    private SpotAssignmentStrategy spotAssignmentStrategy;
    public EntryGate(SpotAssignmentStrategy spotAssignmentStrategy) {
        this.spotAssignmentStrategy = spotAssignmentStrategy;

    }
    public ParkingTicket processVechileEntry(Vechile vechile,SpotType requestedSpotType){
        System.out.println("Vechile: "+vechile.getLicensePlateNumber()+" has entered entry gate");
        ParkingSpot availableSpot = spotAssignmentStrategy.getAvailableSpot(requestedSpotType);
        ParkingTicket ticket = new ParkingTicket(availableSpot,vechile);

        System.out.println("Assigned spot is: "+availableSpot.getSpotNumber());
        System.out.println("Ticket number is : "+ticket.getTicketId());

        return ticket;

    }


}
