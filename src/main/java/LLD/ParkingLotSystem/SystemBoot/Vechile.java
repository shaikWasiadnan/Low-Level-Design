package LLD.ParkingLotSystem.SystemBoot;

import LLD.ParkingLotSystem.SystemBoot.enums.VechileType;

public class Vechile {
   private String licensePlateNumber;
   private VechileType vechileType;

    public Vechile(String licensePlateNumber, VechileType vechileType) {
        this.licensePlateNumber = licensePlateNumber;
        this.vechileType = vechileType;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public VechileType getVechileType() {
        return vechileType;
    }
}
