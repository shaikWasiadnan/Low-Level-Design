package LLD.ParkingLotSystem;

import LLD.ParkingLotSystem.enums.SpotType;

public interface SpotAssignmentStrategy {
    ParkingSpot getAvailableSpot(SpotType type);
    void releaseSpot(ParkingSpot spot);
}
