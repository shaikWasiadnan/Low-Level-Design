package LLD.ParkingLotSystem;

import LLD.ParkingLotSystem.enums.SpotType;

public class ParkingSpot{
    private int spotNumber;
    private SpotType spotType;
    private int distanceFromElevator;

    public ParkingSpot(int spotNumber, int distanceFromElevator, SpotType spotType) {
        this.spotNumber = spotNumber;
        this.distanceFromElevator = distanceFromElevator;
        this.spotType = spotType;
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
