package LLD.ParkingLotSystem;

import LLD.ParkingLotSystem.enums.SpotType;

import java.util.*;



public class SpotNearestToElevatorStrategy implements SpotAssignmentStrategy{
    Map<SpotType,PriorityQueue<ParkingSpot>> availableSpots = new HashMap<>();
    public SpotNearestToElevatorStrategy(List<ParkingSpot> allSpots){
        Comparator<ParkingSpot> comparator = Comparator.comparingInt(ParkingSpot::getDistanceFromElevator);
        availableSpots.put(SpotType.COMPACT,new PriorityQueue<>(comparator));
        availableSpots.put(SpotType.LARGE,new PriorityQueue<>(comparator));
        availableSpots.put(SpotType.HANDICAPPED,new PriorityQueue<>(comparator));
        for(ParkingSpot spot : allSpots){
            availableSpots.get(spot.getSpotType()).add(spot);
        }
    }
    @Override
    public ParkingSpot getAvailableSpot(SpotType type) {
        PriorityQueue<ParkingSpot> parkingSpots = availableSpots.get(type);
        if(parkingSpots.isEmpty() || parkingSpots == null){
            throw new RuntimeException("Spots full");
        }
        return parkingSpots.poll();

    }

    @Override
    public void releaseSpot(ParkingSpot spot) {
         availableSpots.get(spot.getSpotType()).add(spot);
    }
}
