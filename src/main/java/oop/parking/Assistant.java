package oop.parking;

import java.util.Set;

public class Assistant {

    private final Set<Parking> parkingSet;

    public Assistant(Set<Parking> parkingSet) {
        this.parkingSet = parkingSet;
    }

    public boolean park(final String licenseNumber) {
        boolean parked = false;
        for (final Parking currentParking : parkingSet) {
            if (isParkingLessThan80PercentUsed(currentParking)) {
                parked = currentParking.park(licenseNumber);
                if (parked) break;
            }
        }
        return parked;
    }

    private boolean isParkingLessThan80PercentUsed(Parking currentParking) {
        double usage = (double) currentParking.getParkedCars().size() / currentParking.getMaxParkingSlots();
        return 0.8 > usage;
    }

    public boolean retrieve(String licenseNumber) {
        boolean retrieved = false;
        for (Parking parking1 : parkingSet) {
            retrieved = parking1.retrieve(licenseNumber);
        }
        return retrieved;
    }

    public Set<Parking> getParkingSet() {
        return parkingSet;
    }
}
