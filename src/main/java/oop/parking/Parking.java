package oop.parking;

import java.util.HashSet;
import java.util.Set;

public class Parking {

    Set<String> parkedCars = new HashSet<>();

    public boolean park(String licenseNumber) {
        return parkedCars.add(licenseNumber);
    }

    public boolean isParked(String licenseNumber) {
        return parkedCars.contains(licenseNumber);
    }
}
