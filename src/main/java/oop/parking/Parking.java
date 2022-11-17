package oop.parking;

import java.util.HashSet;
import java.util.Set;
import org.checkerframework.checker.units.qual.A;

public class Parking {

    private final Set<String> parkedCars;
    private int maxParkingSlots;
    public Parking(int maxParkingSlots){
        parkedCars = new HashSet<>();
        this. maxParkingSlots = maxParkingSlots;
    }

    public int getMaxParkingSlots() {
        return maxParkingSlots;
    }

    public Set<String> getParkedCars() {
        return parkedCars;
    }

    public boolean park(String licenseNumber) {
        return !isFull() && parkedCars.add(licenseNumber);
    }

    public boolean isParked(String licenseNumber) {
        return parkedCars.contains(licenseNumber);
    }

    public boolean retrieve(String licenseNumber) {
        return parkedCars.remove(licenseNumber);
    }

    public boolean isFull(){
        return parkedCars.size() == maxParkingSlots;
    }
}
