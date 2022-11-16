package oop.parking;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ParkingTest {

    @Test
    public void itShouldParkCar() {
        Parking parkingLot = new Parking();
        assertTrue(parkingLot.park("MAT-001"));
        assertFalse(parkingLot.park("MAT-001"));
        assertTrue(parkingLot.isParked("MAT-001"));
        assertFalse(parkingLot.isParked("MAT-002"));
    }
}
