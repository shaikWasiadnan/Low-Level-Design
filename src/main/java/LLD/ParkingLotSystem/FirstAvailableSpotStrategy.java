package LLD.ParkingLotSystem;

import LLD.ParkingLotSystem.enums.SpotType;

import java.util.*;

public class FirstAvailableSpotStrategy implements SpotAssignmentStrategy{
    Map<SpotType,Queue<ParkingSpot>> availableSpots = new HashMap<>();
    public FirstAvailableSpotStrategy(List<ParkingSpot> allSpots){
        availableSpots.put(SpotType.COMPACT,new LinkedList<>());
        availableSpots.put(SpotType.LARGE,new LinkedList<>());
        availableSpots.put(SpotType.HANDICAPPED,new LinkedList<>());
        for(ParkingSpot spot : allSpots){
            availableSpots.get(spot.getSpotType()).add(spot);
        }

    }
    @Override
    public ParkingSpot getAvailableSpot(SpotType type) {
        Queue<ParkingSpot> queue = availableSpots.get(type);
        if(queue.isEmpty() || queue == null){
            throw new RuntimeException("Spots Full");
        }
        return queue.poll();
    }

    @Override
    public void releaseSpot(ParkingSpot spot) {
        availableSpots.get(spot.getSpotType()).add(spot);
    }
}
