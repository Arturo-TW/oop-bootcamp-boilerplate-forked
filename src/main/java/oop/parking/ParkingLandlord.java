package oop.parking;

public class ParkingLandlord {

    public ParkingLandlord() {
    }

    public boolean needToBuyMoreLand(Parking currentParking) {
        double usage = (double) currentParking.getParkedCars().size() / currentParking.getMaxParkingSlots();
        return 0.75 <= usage;
    }
}
