package LLD.ParkingLotSystem.SystemBoot.EntryGate;

import LLD.ParkingLotSystem.SystemBoot.ParkingSpot;
import LLD.ParkingLotSystem.SystemBoot.Vechile;
import LLD.ParkingLotSystem.SystemBoot.enums.SpotType;

import java.util.UUID;

public class ParkingTicket {
    private String  ticketId;
    private Vechile vechile;
    private ParkingSpot spot;

    public ParkingTicket(ParkingSpot spot, Vechile vechile) {
        this.spot = spot;
        this.ticketId =  UUID.randomUUID().toString().substring(0,5);
        this.vechile = vechile;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public String getTicketId() {
        return ticketId;
    }

    public Vechile getVechile() {
        return vechile;
    }
}
