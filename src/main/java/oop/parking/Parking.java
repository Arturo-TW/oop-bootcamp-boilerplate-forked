package oop.parking;

import java.util.HashSet;
import java.util.Set;
import org.checkerframework.checker.units.qual.A;

public class Parking {

    Set<String> parkedCars;
    public Parking(){
        parkedCars = new HashSet<>();
    }

    public boolean park(String licenseNumber) {
        return parkedCars.add(licenseNumber);
    }

    public boolean isParked(String licenseNumber) {
        return parkedCars.contains(licenseNumber);
    }

    public boolean retrieve(String licenseNumber) {
        return parkedCars.remove(licenseNumber);
    }
}
