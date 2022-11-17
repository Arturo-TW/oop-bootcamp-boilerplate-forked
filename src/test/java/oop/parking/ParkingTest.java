package oop.parking;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ParkingTest {
    Parking parkingLot;
    @BeforeMethod
    public void emptyParking() {
        parkingLot = new Parking(5);
    }

    @Test
    public void itShouldParkCar() {
        assertTrue(parkingLot.park("MAT-001"));
        assertTrue(parkingLot.isParked("MAT-001"));
        assertFalse(parkingLot.isParked("MAT-002"));
    }

    @Test
    public void itShouldRetrieveCar() {
        parkingLot.park("MAT-001");
        assertTrue(parkingLot.retrieve("MAT-001"));
        assertFalse(parkingLot.retrieve("MAT-002"));
    }
}
