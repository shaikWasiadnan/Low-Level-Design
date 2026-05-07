package LLD.ParkingLotSystem.SystemBoot;

import LLD.ParkingLotSystem.SystemBoot.enums.SpotType;

public class ParkingSpot{
    private int spotNumber;
    private SpotType spotType;
    private int distanceFromElevator;

    public ParkingSpot(int spotNumber, SpotType spotType,int distanceFromElevator ) {
        this.spotNumber = spotNumber;
        this.spotType = spotType;
        this.distanceFromElevator = distanceFromElevator;

    }

    public int getDistanceFromElevator() {
        return distanceFromElevator;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public SpotType getSpotType() {
        return spotType;
    }
}
