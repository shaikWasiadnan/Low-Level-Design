package LLD.ParkingLotSystem.SystemBoot;

import LLD.ParkingLotSystem.SystemBoot.enums.SpotType;

public interface SpotAssignmentStrategy {
    ParkingSpot getAvailableSpot(SpotType type);
    void releaseSpot(ParkingSpot spot);
}
